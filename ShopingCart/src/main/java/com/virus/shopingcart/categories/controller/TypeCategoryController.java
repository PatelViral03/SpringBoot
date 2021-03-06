package com.virus.shopingcart.categories.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virus.shopingcart.categories.resource.TypeResource;
import com.virus.shopingcart.categories.service.ITypeCategoryService;

@RestController
@RequestMapping("/categoryType")
public class TypeCategoryController {

	ITypeCategoryService typeCategoryService;

	@Autowired
	public TypeCategoryController(ITypeCategoryService typeCategoryService) {
		this.typeCategoryService = typeCategoryService;
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<TypeResource> getCategoryType() {

		return typeCategoryService.getTypes();

	}

	@GetMapping(value = "{/typeId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public TypeResource getCategoryType(@PathVariable("id") Integer typeId) {
		return typeCategoryService.getType(typeId);
	}

	@PostMapping()
	public void addType(@RequestBody TypeResource type) {

		this.typeCategoryService.addType(type);
	}
	@DeleteMapping("/{typeId}")
	public void deleteType(@PathVariable("typeId") Integer typeId)
	{
		typeCategoryService.removeType(typeId);
		
	}

}
