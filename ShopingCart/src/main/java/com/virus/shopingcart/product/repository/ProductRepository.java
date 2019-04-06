package com.virus.shopingcart.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virus.shopingcart.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
