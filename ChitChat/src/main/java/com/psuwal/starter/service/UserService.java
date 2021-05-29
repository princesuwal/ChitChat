package com.psuwal.starter.service;

import java.util.ArrayList;
import java.util.List;

import com.psuwal.starter.entity.User;
public class UserService {
	
	List<User> userList = new ArrayList<>();
	
	public UserService() {
		for (int i = 1; i <= 5; i++) {
			User u = new User();
			u.setId(i);
			u.setFirstname("User");
			u.setLastname(Integer.toString(i));
			u.setEmail("user_" + i + "@chitchat.com");
			u.setPassword("1234");
			userList.add(u);
		}
	}
	
	public List<User> getAllUsers(){
		return userList;
	}
	
}
