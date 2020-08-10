package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class controllerDemo {

	@GetMapping("/getMsg")
	public String greeting() {
		return "HELLO WITH SECURITY .....ACCESSED ONLY BY ADMIN";
	}
	
}
