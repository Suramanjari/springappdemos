package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.example.QuizPortalApplication;

@SpringBootApplication
public class QuizPortalApplication {


	protected SpringApplicationBuilder configure (SpringApplicationBuilder builder) {
        return builder.sources(QuizPortalApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(QuizPortalApplication.class, args);
	}
}


