package spring.blog.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Iterator;
import java.util.Set;

@Entity
@Table(name="tag")
@Data
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private String name;

    @ManyToMany(mappedBy = "tags",fetch = FetchType.LAZY)
    @Column(nullable = true)
    @JsonBackReference
    private Set<Article> articles;

    public void addArticle(Article article) {
        article.getTags().add(this);
        articles.add(article);
    }

    public void removeServiceCenterTypes(Set<Tag> tagSet) {
        this.articles.removeAll(tagSet);
    }

}
