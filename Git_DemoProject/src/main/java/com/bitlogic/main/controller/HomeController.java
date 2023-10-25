package com.bitlogic.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/message")
	public String sedMsg()
	{
		return "Hello";
	}
	

}
