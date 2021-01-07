package com.design.patterns.behaviroual.observer.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.design.patterns.behaviroual.observer.DTO.UserDetailsDTO;
import com.design.patterns.behaviroual.observer.service.UserService;

@RestController
@RequestMapping(value = "observer")
public class UserResource {

	@Autowired
	UserService userService;
	@PostMapping(value="user")
	public String uploadFile(@RequestBody UserDetailsDTO userDetails) {
		userService.notifyOtherTools(userDetails);
		return "File updated";
	}
}
