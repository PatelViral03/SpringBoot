package com.virus.shopingcart.categories.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "type_category")
@JsonInclude(value = Include.NON_NULL)
public class TypeCategory implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5880719203420487942L;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "type_id")
	private Integer id;
	@Column(name = "type_name")
	private String typeName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
