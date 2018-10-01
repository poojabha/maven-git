package com.example.csv.springbatchcsv.batch;

import com.example.csv.springbatchcsv.model.UserModel;
import com.example.csv.springbatchcsv.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.batch.item.ItemWriter;
import java.util.List;


@Component
public class DBWritter implements ItemWriter<UserModel> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends UserModel> users) throws Exception {

        System.out.println("Data Saved for Users: " + users);
        userRepository.saveAll(users);
    }
}