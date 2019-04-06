package com.virus.shopingcart.users.resource;

import java.io.Serializable;

public class UserResource implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8288511030314276075L;
	private String name;
	private String gender;
	private String email;
	private String mobileNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	
}
