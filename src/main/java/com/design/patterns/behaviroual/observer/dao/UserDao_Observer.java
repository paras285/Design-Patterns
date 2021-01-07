package com.design.patterns.behaviroual.observer.dao;

import com.design.patterns.behaviroual.observer.DTO.UserDetailsDTO;

public interface UserDao_Observer {

	public void updateDatabases(UserDetailsDTO userDetails);
}
