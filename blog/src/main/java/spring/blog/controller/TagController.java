package spring.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.blog.model.Tag;
import spring.blog.repository.TagRepository;

import java.util.List;
@RestController
     @RequestMapping(path = "/tag")
    public class TagController {
    @Autowired
    TagRepository tagRepo;
    @GetMapping(value = "/all")
    public List<Tag> getAll()
    {
        return tagRepo.findAll();
    }
    @PostMapping(path="/load")
    public Tag save(@RequestBody final Tag tag)    {

        tagRepo.save(tag);
        return tagRepo.findById(tag.getId());

    }
}
