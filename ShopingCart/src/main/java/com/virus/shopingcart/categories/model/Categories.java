package com.virus.shopingcart.categories.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.virus.shopingcart.categories.model.TypeCategory;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="category")
public class Categories implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6306681239166452139L;
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="category_id")
	private Integer id;
	@Column(name="category_name")
	private String name;
	@Column(name="category_discription")
	private String discription;
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonManagedReference
	@JoinColumn(name="type_id")
	private TypeCategory type;
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
	public TypeCategory getType() {
		return type;
	}
	public void setType(TypeCategory type) {
		this.type = type;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	
	
	
	
	
}
