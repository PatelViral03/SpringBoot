package com.virus.shopingcart.cart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart_items")
public class CartItems {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	
}
