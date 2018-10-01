package spring.blog.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;


@Entity
@Table(name="article")
@Data
@EqualsAndHashCode()
public class Article implements Serializable {

    private static final long serialVersionUID = 7782533147904858863L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id")
    private Integer id;

    @NotNull
    @Size(max = 250)

    private String description;


   @CreatedDate
    @Column(name = "posted_Date",nullable = false)
    private Date createdDate=new Date();


    @LastModifiedDate
    @Column(name = "modified_date",nullable = false)
    private Date modifiedDate=new Date();


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnoreProperties(value = {"password", "email", "isAdmin", "isActive", "hibernateLazyInitializer", "handler"})
    private User user;


    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Set<Tag> tags;

//    @OneToMany(mappedBy = "article",fetch = FetchType.LAZY)
//    @Column(nullable = true)
//    @JsonBackReference
//    private List<Comment> comments=new ArrayList<>();


    public void removeTag(Tag tag) {
        Iterator<Tag> it = tags.iterator();
        while (it.hasNext()) {
            if (it.next().getId().equals(tag.getId())) {
                it.remove();
            }
        }

    }
    public Long getCreatedDate() {
        if (createdDate != null) {
            return createdDate.getTime();
        }
        return null;
    }

    public Long getModifiedDate() {
        if (modifiedDate != null) {
            return modifiedDate.getTime();
        }
        return null;
    }

}