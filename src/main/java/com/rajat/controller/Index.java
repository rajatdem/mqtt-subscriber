package com.rajat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {

	@RequestMapping("/index")
	public String displayHello () {
		return "Hello Nissan";
	}
}
