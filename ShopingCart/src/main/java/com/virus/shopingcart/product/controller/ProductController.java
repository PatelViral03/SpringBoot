package com.virus.shopingcart.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virus.shopingcart.product.service.IProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	IProductService productService;

	@Autowired
	public ProductController(IProductService productService) {
		this.productService = productService;
	}

}
