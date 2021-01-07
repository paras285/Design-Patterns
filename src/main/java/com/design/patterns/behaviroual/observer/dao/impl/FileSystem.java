package com.design.patterns.behaviroual.observer.dao.impl;

import org.springframework.stereotype.Component;

import com.design.patterns.behaviroual.observer.DTO.UserDetailsDTO;
import com.design.patterns.behaviroual.observer.dao.UserDao_Observer;

@Component
public class FileSystem implements UserDao_Observer {

	@Override
	public void updateDatabases(UserDetailsDTO userDetails) {
		System.out.println("Updating Filesystem with userdetails "+userDetails);
	}

}
