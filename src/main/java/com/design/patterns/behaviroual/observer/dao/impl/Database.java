package com.design.patterns.behaviroual.observer.dao.impl;

import org.springframework.stereotype.Component;

import com.design.patterns.behaviroual.observer.DTO.UserDetailsDTO;
import com.design.patterns.behaviroual.observer.dao.UserDao_Observer;

@Component
public class Database implements UserDao_Observer {

	@Override
	public void updateDatabases(UserDetailsDTO userDetails) {
		System.out.println("Updating Database with userdetails "+userDetails);
	}

}
