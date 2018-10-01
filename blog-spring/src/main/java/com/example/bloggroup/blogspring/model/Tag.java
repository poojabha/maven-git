/*package com.example.bloggroup.blogspring.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "tag",catalog ="BlogSpring")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tag_id")
    private String id;

    @NotNull
    @Column(unique = true,name="tag_name")
    private String tag;

   @ManyToMany(mappedBy = "tags")
    private Set<Article> articles = new HashSet<>();
    public Tag() {
    }

    public Tag(String id, @NotNull String tag, Set<Article> articles) {
        this.id = id;
        this.tag = tag;
        this.articles = articles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }
}
*/