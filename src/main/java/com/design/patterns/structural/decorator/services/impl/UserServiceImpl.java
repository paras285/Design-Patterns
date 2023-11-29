package com.design.patterns.structural.decorator.services.impl;

import org.springframework.stereotype.Service;

import com.design.patterns.structural.decorator.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public void getUserData() {
		System.out.println("Getting User Data in User Service. CALL Repositories");
	}

	@Override
	public void saveUserData() {
		System.out.println("Saving User Data in User Service CALL Repositories");
	}

}
