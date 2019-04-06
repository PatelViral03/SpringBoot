package com.virus.shopingcart.product.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_domain")
public class ProductDomain {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer id;
}
