package com.virus.shopingcart.users.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virus.shopingcart.users.resource.RoleDetailsResource;
import com.virus.shopingcart.users.resource.RoleResource;
import com.virus.shopingcart.users.resource.RoleResourceMapper;
import com.virus.shopingcart.users.respository.RoleRepository;

@Service
@Transactional
public class RoleServiceImpl implements IRoleService {

	RoleRepository roleRepository;
	RoleResourceMapper roleResourceMapper;

	@Autowired
	public RoleServiceImpl(RoleRepository roleRepository, RoleResourceMapper roleResourceMapper) {
		this.roleRepository = roleRepository;
		this.roleResourceMapper = roleResourceMapper;
	}

	@Override
	public void addRole(RoleResource roleResource) {

		if (roleRepository.isExistRole(roleResource.getRole()) == null)
			roleRepository.save(roleResourceMapper.fromResource(roleResource));
	}

	@Override
	public List<RoleDetailsResource> getRoles() {

		return roleResourceMapper.fromCollectionEntity(roleRepository.findAll());
	}

}
