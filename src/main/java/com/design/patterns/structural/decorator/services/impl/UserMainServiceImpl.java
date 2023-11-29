package com.design.patterns.structural.decorator.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.design.patterns.structural.decorator.services.UserService;

@Service
@Primary
public class UserMainServiceImpl implements UserService {

	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void getUserData() {
		System.out.println("Logging Data in decorator pattern starts");
		userService.getUserData();
		System.out.println("Logging Data in decorator pattern ends");
	}

	@Override
	public void saveUserData() {
		System.out.println("Logging Data in decorator pattern starts");
		userService.saveUserData();
		System.out.println("Logging Data in decorator pattern ends");

	}

}
