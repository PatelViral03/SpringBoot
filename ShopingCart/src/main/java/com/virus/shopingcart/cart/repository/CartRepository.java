package com.virus.shopingcart.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virus.shopingcart.cart.model.CartItems;

public interface CartRepository extends JpaRepository<CartItems, Integer> {

}
