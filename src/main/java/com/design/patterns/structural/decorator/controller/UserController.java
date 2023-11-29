package com.design.patterns.structural.decorator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.design.patterns.structural.decorator.services.UserService;

@RestController
public class UserController {

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("structural/users")
	public String getDetails() {
		userService.getUserData();
		return "Hello from Controller";
	}
	
}
