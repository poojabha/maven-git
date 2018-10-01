package spring.blog.repository;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import spring.blog.model.Article;
import spring.blog.model.User;
import static org.assertj.core.api.Assertions.*;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@DataJpaTest
public class ArticleRepositoryTest {
    @Autowired
    ArticleRepository articleRepository;
@Autowired
UserRepository userRepository;
User user=null;
    @Before
    public void setUp()
    {
        user=new User();
        user.setName("pooja");
        user.setEmail("poojabhat1111");
        user.setActive(true);
        user.setAdmin(false);
        user=userRepository.save(user);
    }

    @Test
    public void articleTest()
    {
        Article article=new Article();
        article.setDescription("article in testing");
        article.setUser(user);
        article=articleRepository.save(article);
        Article foundarticle =articleRepository.findById(article.getId());
       assertThat(foundarticle.getDescription()).isEqualTo(article.getDescription());

    }



    @After
    public void cleanUp() {
        articleRepository.deleteAll();
        userRepository.deleteAll();
    }
}
