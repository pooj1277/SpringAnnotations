package com.bridgelabz.HelloWorldSpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldSpringAppApplication.class, args);
		System.out.println("Hello from Pooja");
	}

}
