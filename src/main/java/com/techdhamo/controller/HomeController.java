package com.techdhamo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller//REST API
public class HomeController {

	
	@RequestMapping("")
	String home() {
		return "hello";
	}
}
