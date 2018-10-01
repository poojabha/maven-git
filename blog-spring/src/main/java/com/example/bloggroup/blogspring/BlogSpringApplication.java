package com.example.bloggroup.blogspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.bloggroup.blogspring.repository")
@SpringBootApplication
public class BlogSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogSpringApplication.class, args);
	}
}
