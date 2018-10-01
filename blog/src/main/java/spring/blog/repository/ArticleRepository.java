package spring.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import spring.blog.model.Article;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {

    Article findById(Integer id);
    @Query("select a from  Article a where a.user.id=:uid")
    List<Article> findArticleByUser(Long uid);
    @Query("select description,user.name,user.id from Article")
    List<Object> getUD();

}
