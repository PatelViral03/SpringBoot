package com.virus.shopingcart.users.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virus.shopingcart.users.resource.UserDetailsResource;
import com.virus.shopingcart.users.resource.UserResourceMapper;
import com.virus.shopingcart.users.respository.UsersRepository;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	
	UsersRepository userRepository;
	UserResourceMapper userMapper;
	
	

@Autowired
	public UserServiceImpl(UsersRepository userRepository, UserResourceMapper userMapper) {
		this.userRepository = userRepository;
		this.userMapper = userMapper;
	}

	public UserResourceMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserResourceMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public void Registration(UserDetailsResource user) {
		
		if(userRepository.isUserExist(user.getEmail())==null)
		{
			userRepository.save(userMapper.fromResource(user));
		}
	}

	@Override
	public void deactiveAccount() {
		
		
	}

	@Override
	public void activeAccount() {
	
		
	}

	@Override
	public void updateUser() {
	
		
	}

}
