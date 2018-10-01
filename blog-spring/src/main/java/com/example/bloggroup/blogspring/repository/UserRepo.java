package com.example.bloggroup.blogspring.repository;

import com.example.bloggroup.blogspring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface UserRepo extends JpaRepository<User,Integer> {
    User findByName(String name);
    User findById(Long id);

}
