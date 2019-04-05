package com.virus.shopingcart.categories.resource;

import java.io.Serializable;

public class CategoryDetailsResource implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -327103990852936162L;
	private String categoryName;
	private String discription;
	private Integer typeId;
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	
	
}
