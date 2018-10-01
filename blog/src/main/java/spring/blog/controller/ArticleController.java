package spring.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.blog.model.Article;
import spring.blog.model.User;
import spring.blog.repository.ArticleRepository;
import spring.blog.repository.UserRepository;

import java.util.List;
@RestController
@RequestMapping(path="/article")
public class ArticleController {

    @Autowired
    ArticleRepository articleRepo;
    @Autowired
    UserRepository userRepo;


    @GetMapping("/all")

    public List<Article> getAll()
    {
        return articleRepo.findAll();
    }


//    @PostMapping(path="/load/userid={id}/tagid={id1}")
//    public Article save(@RequestBody final Article article,@PathVariable final Integer id,@PathVariable final Integer id1)    {
//        Tag tag=tagController.findById(id1);
//        article.addTag(tag);
//        User user=userController.findById(id);
//        article.setUser(user);
//        articleController.save(article);
//        return articleController.findById(article.getId());
//
//    }

    @PostMapping(path="/load/userid={id}")
    public Article save(@RequestBody final Article article,@PathVariable final Integer id)    {

        User user=userRepo.findById(id);
        article.setUser(user);
        articleRepo.save(article);
        return articleRepo.findById(article.getId());

    }
    @GetMapping(value="/get_all_article/userid={uid}")
    public    List<Article> getArticlesByUser(@PathVariable final Long uid) {
        return articleRepo.findArticleByUser(uid);
    }

    @GetMapping("/UserAndDesc")
    public List<Object> getUserAndDescription()
    {
        List<Object> ar=articleRepo.getUD();
        return ar;
    }
}
