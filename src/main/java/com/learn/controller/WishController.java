package com.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class WishController {

	@GetMapping("/wish")
	public String wishMe()
	{
		return "Hello Altaf, Deploy it on Heroku";
	}
}
