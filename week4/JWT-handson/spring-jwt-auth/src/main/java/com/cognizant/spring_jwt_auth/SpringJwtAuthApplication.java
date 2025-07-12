package com.cognizant.spring_jwt_auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJwtAuthApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringJwtAuthApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtAuthApplication.class, args);
		LOGGER.info("Inside main method");
	}
}
