package com.virus.shopingcart.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virus.shopingcart.product.service.IProductDomainService;

@RestController
@RequestMapping("/product-domian")
public class ProductDomainController {

		IProductDomainService productDomainService;

		@Autowired
		public ProductDomainController(IProductDomainService productDomainService) {
			this.productDomainService = productDomainService;
		}
		
}
