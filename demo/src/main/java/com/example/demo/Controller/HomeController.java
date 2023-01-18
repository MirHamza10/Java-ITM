package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.java.IHomeService;

@RestController

public class HomeController {

	@Autowired
	IHomeService homeService;
	
	@GetMapping(path = "/message")
	public String getMessage() {
		return homeService.getMessage();
	}

}
