package com.jenkins.docker.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping
	public String welcomeMessage() {
		return "Hello Welcome to Devops Tutorial";
		
	}

}
