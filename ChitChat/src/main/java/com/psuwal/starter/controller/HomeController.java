package com.psuwal.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.psuwal.starter.service.UserService;
import com.psuwal.starter.entity.User;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/home")
	public String homePage(Model model) {
		List<User> allUser = userService.getAllUsers();
		
		model.addAttribute("allUser", allUser);
		
		return "index";
	}
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}	
}
