package com.example.bloggroup.blogspring.repository;

import com.example.bloggroup.blogspring.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepo extends JpaRepository<Article,Integer> {
    Article findById(Long id);
}
