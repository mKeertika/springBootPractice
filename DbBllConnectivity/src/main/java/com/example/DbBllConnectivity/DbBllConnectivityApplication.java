package com.example.DbBllConnectivity;

import com.example.DbBllConnectivity.repositiries.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DbBllConnectivityApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(DbBllConnectivityApplication.class, args);
		applicationContext.getBean(StudentRepo.class);
	}

}
