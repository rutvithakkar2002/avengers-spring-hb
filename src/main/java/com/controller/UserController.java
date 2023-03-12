package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Entity.UserEntity;
import com.dao.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/signup")
	public String signUp()
	{
		return "Signup";
	}
	
	@PostMapping("saveuser")
	public String saveUser(UserEntity user) //for read the data from jsp
	{
		userRepo.save(user);
		System.out.println(user.getUserId());
		return "Signup";
	}
}
