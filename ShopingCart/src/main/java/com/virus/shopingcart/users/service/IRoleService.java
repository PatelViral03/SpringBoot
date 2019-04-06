package com.virus.shopingcart.users.service;

import java.util.List;

import com.virus.shopingcart.users.resource.RoleDetailsResource;
import com.virus.shopingcart.users.resource.RoleResource;

public interface IRoleService {

	public void addRole(RoleResource roleResource);
	public List<RoleDetailsResource> getRoles();
}
