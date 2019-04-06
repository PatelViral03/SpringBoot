package com.virus.shopingcart.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.virus.shopingcart.users.resource.UserDetailsResource;
import com.virus.shopingcart.users.service.IUserService;

@RestController
@RequestMapping("/registration")
public class Registration {

	IUserService userService;
	
	@Autowired
	public Registration(IUserService userService) {
		this.userService = userService;
	}


	@PostMapping
	public void userRegistration(@RequestBody UserDetailsResource user)
	{
		userService.Registration(user);
		
	}
}
