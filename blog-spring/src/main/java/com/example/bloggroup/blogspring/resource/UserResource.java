package com.example.bloggroup.blogspring.resource;

import com.example.bloggroup.blogspring.model.User;
import com.example.bloggroup.blogspring.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="/user")
public class UserResource {
    @Autowired
    UserRepo userRepo;
    @GetMapping(value = "/all")
    public List<User> getAll()
    {
        return userRepo.findAll();
    }
    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable final Long id)
    {

        User user=new User();
        user.setId(id);
        return userRepo.findById(user.getId());

    }

    @PostMapping(path ="/load")
    public User persist(@RequestBody final User user)
    {
        userRepo.save(user);
        return userRepo.findByName(user.getName());

    }

}
