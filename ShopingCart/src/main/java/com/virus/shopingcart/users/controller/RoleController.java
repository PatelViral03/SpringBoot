package com.virus.shopingcart.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virus.shopingcart.users.resource.RoleDetailsResource;
import com.virus.shopingcart.users.resource.RoleResource;
import com.virus.shopingcart.users.service.IRoleService;

@RestController
@RequestMapping("/role")
public class RoleController {

	IRoleService roleService;

	@Autowired
	public RoleController(IRoleService roleService) {
		this.roleService = roleService;
	}

	@PostMapping
	public void addRole(@RequestBody RoleResource roleResource) {
		roleService.addRole(roleResource);
	}

	@GetMapping
	public List<RoleDetailsResource> getRoles() {
		return roleService.getRoles();
	}

}
