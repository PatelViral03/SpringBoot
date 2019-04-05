package com.virus.shopingcart.users.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Roles {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="role_id")	
	private Integer id;
	
	@Column(name="role_name")
	private String roleName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	

}
