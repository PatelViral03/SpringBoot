package com.virus.shopingcart.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virus.shopingcart.cart.service.ICartService;

@RestController
@RequestMapping("add-to-cart")
public class CartController {

	ICartService cartService;

	@Autowired
	public CartController(ICartService cartService) {
		this.cartService = cartService;
	}
	
	
	
}
