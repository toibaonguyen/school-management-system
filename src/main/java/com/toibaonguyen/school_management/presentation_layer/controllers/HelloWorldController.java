package com.toibaonguyen.school_management.presentation_layer.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hi, i'm Toibaonguyen and hello the world";
	}
}
