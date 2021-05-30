package com.psuwal.starter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psuwal.starter.entity.User;
import com.psuwal.starter.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}

	public User addUser(User user) {
		userRepo.save(user);
		return user;
	}
	
}
