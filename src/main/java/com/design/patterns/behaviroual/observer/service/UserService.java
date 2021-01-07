package com.design.patterns.behaviroual.observer.service;

import com.design.patterns.behaviroual.observer.DTO.UserDetailsDTO;

public interface UserService {

	void notifyOtherTools(UserDetailsDTO userDetails);
}
