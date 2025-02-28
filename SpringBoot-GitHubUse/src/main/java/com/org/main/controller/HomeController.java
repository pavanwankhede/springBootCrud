package com.org.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@GetMapping("/firstPage")
	public String firstPage() {
		
		return"Wecome";
	}
@GetMapping("/msg")
	public String printMsg() {
		
		return"Success";
	}
}
