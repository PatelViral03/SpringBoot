package com.virus.shopingcart.categories.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virus.shopingcart.categories.resource.CategoryDetailsResource;
import com.virus.shopingcart.categories.resource.CategoryResource;
import com.virus.shopingcart.categories.service.ICategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	ICategoryService categoryService;

	@Autowired
	public CategoryController(ICategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@GetMapping()
	public List<CategoryResource> getCategories() {
		return categoryService.getCategories();
	}

	@GetMapping("/{categoryId}")
	public	CategoryResource getCategory(@PathVariable("categoryId") Integer categoryId)
	{
		return categoryService.getCategory(categoryId);
	}
	
	@PostMapping
	public void addCategory(@RequestBody CategoryDetailsResource categoryDetailsResource)
	{
		categoryService.addCategories(categoryDetailsResource);
	}
	
	@DeleteMapping("/{categoryId}")
	public void DeleteCategory(@PathVariable("categoryId") Integer categoryId)
	{
		categoryService.removeCategory(categoryId);
	}
	
	
	
	
	
}
