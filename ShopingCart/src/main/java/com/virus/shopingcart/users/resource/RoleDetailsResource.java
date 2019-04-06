package com.virus.shopingcart.users.resource;

import java.io.Serializable;

public class RoleDetailsResource implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2625140445927974915L;
	private Integer roleId;
	private String role;
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
