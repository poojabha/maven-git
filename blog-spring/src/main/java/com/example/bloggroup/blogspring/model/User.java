package com.example.bloggroup.blogspring.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="user",catalog = "blog_spring")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long id;

    private String password;

    private String name;

    private String email;

    private boolean is_admin;

    private boolean is_active;

  @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Article> articles=new ArrayList<>();

  public void addArticle(Article article) {
        articles.add(article);
        article.setUser(this);
    }

    // Obligatory method in bidirectional @OneToMany
    public void removeComment(Article article) {
        articles.remove(article);
        article.setUser(null);
    }

    public User() {
    }

    public User(Long id, String password, String name, String email, boolean is_admin, boolean is_active, List<Article> articles) {

        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.is_admin = is_admin;
        this.is_active = is_active;
        this.articles = articles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIs_admin() {
        return is_admin;
    }

    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
