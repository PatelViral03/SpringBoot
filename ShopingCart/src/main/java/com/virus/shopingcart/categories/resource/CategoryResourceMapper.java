package com.virus.shopingcart.categories.resource;

import org.springframework.stereotype.Component;

import com.virus.shopingcart.categories.model.Categories;

@Component
public class CategoryResourceMapper {

	public CategoryResource fromEntity(Categories categorie) {
		CategoryResource categoryResource = new CategoryResource();
		categoryResource.setName(categorie.getName());
		categoryResource.setDescription(categorie.getDiscription());
		categoryResource.setType(categorie.getType().getTypeName());
		return categoryResource;
	}

}
