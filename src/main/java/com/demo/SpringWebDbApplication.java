package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebDbApplication.class, args);
	}

	/*
	@SpringBootApplication - enables Spring Boot autoconfiguration and component scanning.
	@SpringBootApplication is a compilation of the @Configuration, @EnableAutoConfiguration, and @ComponentScan annotations.


	Applying @SpringBootApplication to a Spring app’s main application class

	Enables Spring to identify the class as the configuration class that provides beans for the Spring application context
	Enables Spring to scan for and configure annotated classes as beans
	Enables Spring to configure beans based on code as well as jar dependencies
	 */
}
