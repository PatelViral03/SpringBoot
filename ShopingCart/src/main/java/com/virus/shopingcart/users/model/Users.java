package com.virus.shopingcart.users.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "user_details")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Integer id;
	@Column(name = "user_name")
	private String name;
	@Column(name = "user_gender")
	private String gender;
	@Column(name = "user_email")
	private String email;
	@Column(name = "user_mobile_no")
	private String mobileNo;
	@Column(name = "user_password")
	private String password;
	@Column(name = "user_status")
	private boolean status;
	
	@JsonManagedReference
	@ManyToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinTable(name = "user_role", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = { @JoinColumn(name = "role_id") })
    private Set<Roles> role=new HashSet<Roles>();	


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password =password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Set<Roles> getRole() {
		return role;
	}

	public void setRole(Set<Roles> role) {
		this.role = role;
	}

}
