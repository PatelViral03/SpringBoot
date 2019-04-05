package com.virus.shopingcart.categories.resource;

import java.io.Serializable;

public class CategoryResource implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2337678378987374252L;
	private String name;
	private String Description;
	private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
