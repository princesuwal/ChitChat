package com.psuwal.starter.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psuwal.starter.service.UserService;
import com.psuwal.starter.entity.User;
@RestController
public class HomeController {

	private UserService userService;
	@GetMapping("/home")
	public String homePage() {
		return "Welcome to home Page";
	}
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
}
