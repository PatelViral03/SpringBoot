package com.virus.shopingcart.users.service;

import com.virus.shopingcart.users.resource.UserDetailsResource;

public interface IUserService {
	
	public void Registration(UserDetailsResource users);
	public void deactiveAccount();
	public void activeAccount();
	public void updateUser();

}
