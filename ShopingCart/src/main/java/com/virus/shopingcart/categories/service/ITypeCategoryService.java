package com.virus.shopingcart.categories.service;

import java.util.List;

import com.virus.shopingcart.categories.resource.TypeResource;

public interface ITypeCategoryService {

	TypeResource addType(TypeResource type);
	TypeResource getType(Integer id);
	TypeResource removeType(Integer id);
	List<TypeResource> getTypes();
}
