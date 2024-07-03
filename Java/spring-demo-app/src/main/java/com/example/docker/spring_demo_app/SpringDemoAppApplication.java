package com.example.docker.spring_demo_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDemoAppApplication {
	
	@RequestMapping("/")
	public String home(){
		return "Hello World, Dockering Spring Boot Application! ";
	}

	@RequestMapping("/home")
	public String homepages(){
		return "<h1>This is the homepage section</h1>";
	}

	@RequestMapping("/login")
	public String login(){
		return "<h1>This is the Login section</h1>";
	}

	@RequestMapping("/logout")
	public String logout(){
		return "<h1>This is the Logout section</h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoAppApplication.class, args);
	}

}