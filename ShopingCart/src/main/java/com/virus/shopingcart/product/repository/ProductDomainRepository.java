package com.virus.shopingcart.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virus.shopingcart.product.model.ProductDomain;

public interface ProductDomainRepository extends JpaRepository<ProductDomain, Integer> {

}
