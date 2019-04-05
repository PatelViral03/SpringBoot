package com.virus.shopingcart.categories.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virus.shopingcart.categories.model.Categories;
import com.virus.shopingcart.categories.repository.CategoryRepository;
import com.virus.shopingcart.categories.resource.CategoryDetailsResource;
import com.virus.shopingcart.categories.resource.CategoryResource;
import com.virus.shopingcart.categories.resource.CategoryResourceMapper;

@Service
@Transactional
public class CategoryServiceImpl implements ICategoryService {

	CategoryRepository categoryRepository;
	CategoryResourceMapper categoryResourceMapper;

	@Autowired
	public CategoryServiceImpl(CategoryRepository categoryRepository, CategoryResourceMapper categoryResourceMapper) {
		this.categoryRepository = categoryRepository;
		this.categoryResourceMapper = categoryResourceMapper;
	}

	@Override
	public List<CategoryResource> getCategories() {

		return categoryResourceMapper.fromCollectionEntity(categoryRepository.findAll());
	}

	@Override
	public void addCategories(CategoryDetailsResource categoryResource) {

		if (categoryRepository.getByName(categoryResource.getCategoryName()) == null) {
			categoryRepository.save(categoryResourceMapper.fromResource(categoryResource));
		}

	}

	@Override
	public CategoryResource getCategory(Integer categoryId) {

		return categoryResourceMapper.fromEntity(categoryRepository.getOne(categoryId));
	}

	@Override
	public void removeCategory(Integer categoryId) {
		Categories category = categoryRepository.getOne(categoryId);
		if (category != null) {
			categoryRepository.delete(category);
		}
	}

	@Override
	public void updateCategory(CategoryDetailsResource categoryResource) {

	}

}
