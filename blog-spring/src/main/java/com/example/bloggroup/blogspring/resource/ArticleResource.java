package com.example.bloggroup.blogspring.resource;

import com.example.bloggroup.blogspring.model.Article;
import com.example.bloggroup.blogspring.model.User;
import com.example.bloggroup.blogspring.repository.ArticleRepo;
import com.example.bloggroup.blogspring.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.Boolean.*;

@RestController
@RequestMapping(path="/article")
public class ArticleResource {
    @Autowired
    ArticleRepo articleRepo;
    UserRepo userRepo;

    @GetMapping(value = "/all")
    public List<Article> getAll()
    {
        return articleRepo.findAll();
    }

    @PostMapping(path ="/load")
    public Article persist(@RequestBody final Article article)
    {
          articleRepo.save(article);
          return articleRepo.findById(article.getId());


    }
    @GetMapping(value = "/update/{name}")
    public List<Article> update(@PathVariable final String name)
    {
        User users=new User();
        users.setName(name);
        users.setPassword("1234");
        users.setEmail("pooja@gmail.com");
        users.setIs_active(TRUE);
        users.setIs_admin(FALSE);
        Article a1=new Article();
        a1.setDescription("article for python and django");
        a1.setUser(users);
        articleRepo.save(a1);

        Article a2=new Article();
        a2.setDescription("article for spring boot");
        a2.setUser(users);
        articleRepo.save(a2);
        return articleRepo.findAll();
    }


}
