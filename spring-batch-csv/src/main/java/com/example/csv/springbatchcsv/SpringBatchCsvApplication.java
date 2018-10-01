package com.example.csv.springbatchcsv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.csv.springbatchcsv.repository")
@SpringBootApplication
public class SpringBatchCsvApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchCsvApplication.class, args);
	}
}
