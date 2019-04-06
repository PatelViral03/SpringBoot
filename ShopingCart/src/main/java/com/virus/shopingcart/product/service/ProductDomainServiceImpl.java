package com.virus.shopingcart.product.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virus.shopingcart.product.repository.ProductDomainRepository;
import com.virus.shopingcart.product.resource.ProductDomainResourceMapper;

@Service
@Transactional
public class ProductDomainServiceImpl implements IProductDomainService {

	ProductDomainResourceMapper productDomainResourceMapper;
	ProductDomainRepository productDomainRepository;
	@Autowired
	public ProductDomainServiceImpl(ProductDomainResourceMapper productDomainResourceMapper,
			ProductDomainRepository productDomainRepository) {
		this.productDomainResourceMapper = productDomainResourceMapper;
		this.productDomainRepository = productDomainRepository;
	}
	
	
	
}
