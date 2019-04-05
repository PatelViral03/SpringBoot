package com.virus.shopingcart.categories.service;

import java.util.List;

import com.virus.shopingcart.categories.resource.CategoryDetailsResource;
import com.virus.shopingcart.categories.resource.CategoryResource;

public interface ICategoryService {

	public List<CategoryResource> getCategories();
	public void addCategories(CategoryDetailsResource categoryResource);
	public CategoryResource getCategory(Integer categoryId);
	public void removeCategory(Integer categoryId);
	public void updateCategory(CategoryDetailsResource categoryResource);
}
