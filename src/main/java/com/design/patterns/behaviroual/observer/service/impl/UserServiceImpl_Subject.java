package com.design.patterns.behaviroual.observer.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.design.patterns.behaviroual.observer.DTO.UserDetailsDTO;
import com.design.patterns.behaviroual.observer.dao.UserDao_Observer;
import com.design.patterns.behaviroual.observer.service.UserService;

@Component
public class UserServiceImpl_Subject implements UserService{

	List<UserDao_Observer> userDaoList;
	public UserServiceImpl_Subject(Set<UserDao_Observer> userDaoSet) {
		userDaoList = new ArrayList<UserDao_Observer>();
		userDaoSet.stream().forEach(dao -> userDaoList.add(dao));
	}

	@Override
	public void notifyOtherTools(UserDetailsDTO userDetails) {
		userDaoList.forEach(
					dao -> dao.updateDatabases(userDetails)
				);
	}
}
