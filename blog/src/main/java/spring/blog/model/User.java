package spring.blog.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="user")
@Data public class User {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private String name;

    private String email;

    private boolean isAdmin;

    private boolean isActive;


    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    @Column(nullable = true)
    @JsonBackReference
    private List<Article> articles=new ArrayList<>();
    

//    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
//    @Column(nullable = true)
//    @JsonBackReference
//    private List<Comment> comments=new ArrayList<>();


    public void addArticle(Article article) {


        articles.add(article);
        article.setUser(this);}


    // Obligatory method in bidirectional @OneToMany
    public void removeArticle(Article article) {
        articles.remove(article);
        article.setUser(null);
    }




}
