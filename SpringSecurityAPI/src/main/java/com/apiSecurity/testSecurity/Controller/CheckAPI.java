package com.apiSecurity.testSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class CheckAPI {
	
	@GetMapping
	public static String hello() {
		return "Heyy  Helloo!";
	}
	@GetMapping("/bye")
	public static String bye() {
		
		return "Heyy Bye!";
	}
}
