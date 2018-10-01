package spring.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.blog.model.User;
import spring.blog.repository.UserRepository;

import java.util.List;
@RestController
@RequestMapping(path="/user")
public class UserController {

    @Autowired
    UserRepository userRepo;

    @GetMapping(value = "/all")
    public List<User> getAll()
    {
        return userRepo.findAll();
    }
    @PostMapping(path="/load")
    public User save(@RequestBody final User user)
    {

        userRepo.save(user);
        return userRepo.findById(user.getId());

    }

}
