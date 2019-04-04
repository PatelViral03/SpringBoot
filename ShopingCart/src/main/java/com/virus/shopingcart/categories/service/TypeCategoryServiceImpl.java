package com.virus.shopingcart.categories.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virus.shopingcart.categories.model.TypeCategory;
import com.virus.shopingcart.categories.repository.ITypeCategoryRepository;
import com.virus.shopingcart.categories.resource.TypeResource;
import com.virus.shopingcart.categories.resource.TypeResourceMapper;

@Service
@Transactional
public class TypeCategoryServiceImpl implements ITypeCategoryService {


	ITypeCategoryRepository typeCategoryRepository;
	
	TypeResourceMapper typeResourceMapper;


	
@Autowired
	public TypeCategoryServiceImpl(ITypeCategoryRepository typeCategoryRepository,
			TypeResourceMapper typeResourceMapper) {
		this.typeCategoryRepository = typeCategoryRepository;
		this.typeResourceMapper = typeResourceMapper;
	}

	@Override
	public TypeResource addType(TypeResource type) {

		if (typeCategoryRepository.typeIsExist(type.getTypeName()) == null) {
			typeCategoryRepository.save(typeResourceMapper.fromResource(type));
			return type;
		} else {
			return null;
		}
	}

	@Override
	public TypeResource getType(Integer id) {
		return typeResourceMapper.fromEntity(typeCategoryRepository.getOne(id));
	}

	@Override
	public TypeResource removeType(Integer id) {

		TypeCategory type= typeCategoryRepository.getOne(id);
		if(type!=null)
			typeCategoryRepository.delete(type);
		return null;
	}

	@Override
	public List<TypeResource> getTypes() {
		// TODO Auto-generated method stub
		return typeResourceMapper.fromCollectionEntiry(typeCategoryRepository.findAll());
	}

}
