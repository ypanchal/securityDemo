package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noauth/rest")
public class Nosecuritycontroller {
	
	@GetMapping("/sayhello")
	public String hello() {
		return "HELLO WTHOUT SECURITY";
	}

}
