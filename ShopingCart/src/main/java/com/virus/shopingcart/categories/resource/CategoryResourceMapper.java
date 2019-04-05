package com.virus.shopingcart.categories.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.virus.shopingcart.categories.model.Categories;
import com.virus.shopingcart.categories.model.TypeCategory;

@Component
public class CategoryResourceMapper {

	public CategoryResource fromEntity(Categories categorie) {
		CategoryResource categoryResource = new CategoryResource();
		categoryResource.setName(categorie.getName());
		categoryResource.setDescription(categorie.getDiscription());
		categoryResource.setType(categorie.getType().getTypeName());
		return categoryResource;
	}
	
	public Categories fromResource(CategoryDetailsResource categoryDetailsResource)
	{
		Categories category=new Categories();
		category.setName(categoryDetailsResource.getCategoryName());	
		category.setDiscription(categoryDetailsResource.getDiscription());
		TypeCategory type=new TypeCategory();
		type.setId(categoryDetailsResource.getTypeId());
		category.setType(type);
		return category;
	}
	
	public List<CategoryResource> fromCollectionEntity(List<Categories> categories)
	{
		return categories.stream().map(category->fromEntity(category)).collect(Collectors.toList());
	}
	
	
}
