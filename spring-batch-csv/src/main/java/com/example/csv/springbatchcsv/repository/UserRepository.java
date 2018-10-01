package com.example.csv.springbatchcsv.repository;

import com.example.csv.springbatchcsv.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel,Integer> {
}


