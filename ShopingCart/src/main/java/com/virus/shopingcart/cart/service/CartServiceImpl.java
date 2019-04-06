package com.virus.shopingcart.cart.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virus.shopingcart.cart.repository.CartRepository;
import com.virus.shopingcart.cart.resource.CartResourceMapper;

@Service
@Transactional
public class CartServiceImpl implements ICartService {

	CartRepository cartRepository;
	CartResourceMapper cartResourceMapper;
	
	@Autowired
	public CartServiceImpl(CartRepository cartRepository, CartResourceMapper cartResourceMapper) {
		this.cartRepository = cartRepository;
		this.cartResourceMapper = cartResourceMapper;
	}
	
	
	
	
}
