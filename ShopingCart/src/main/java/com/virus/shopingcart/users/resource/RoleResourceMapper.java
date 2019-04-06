package com.virus.shopingcart.users.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.virus.shopingcart.users.model.Roles;

@Component
public class RoleResourceMapper {

		
		public Roles fromResource(RoleResource roleResource)
		{
			Roles role=new Roles();
			role.setRoleName(roleResource.getRole());
			return role;
		}
		public RoleDetailsResource fromEnity(Roles role)
		{
			RoleDetailsResource roleDetailsResource=new RoleDetailsResource();
			roleDetailsResource.setRoleId(role.getId());
			roleDetailsResource.setRole(role.getRoleName());
			return roleDetailsResource;
		}
		
		public List<RoleDetailsResource> fromCollectionEntity(List<Roles> roles )
		{
			return roles.stream().map(role->fromEnity(role)).collect(Collectors.toList());
		}
		
		
	
	
}
