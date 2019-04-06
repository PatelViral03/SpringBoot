package com.virus.shopingcart.product.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virus.shopingcart.product.repository.ProductRepository;
import com.virus.shopingcart.product.resource.ProductResourceMapper;

@Service
@Transactional
public class ProductServiceImpl implements IProductService {

	ProductResourceMapper productResourceMapper;
	ProductRepository productRepository;
	@Autowired
	public ProductServiceImpl(ProductResourceMapper productResourceMapper, ProductRepository productRepository) {
		this.productResourceMapper = productResourceMapper;
		this.productRepository = productRepository;
	}
	
	
	
}
