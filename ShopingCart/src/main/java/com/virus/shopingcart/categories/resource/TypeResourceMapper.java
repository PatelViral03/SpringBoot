package com.virus.shopingcart.categories.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.virus.shopingcart.categories.model.TypeCategory;

@Component
public class TypeResourceMapper {

	public TypeResource fromEntity(TypeCategory typeCategory) {
		TypeResource type = new TypeResource();
		type.setTypeName(typeCategory.getTypeName());
		return type;
	}

	public List<TypeResource> fromCollectionEntiry(List<TypeCategory> types)
	{
		return types.stream().map(type->fromEntity(type)).collect(Collectors.toList());
	}
	
	public TypeCategory fromResource(TypeResource typeResorce)
	{
		TypeCategory type=new TypeCategory();
		type.setTypeName(typeResorce.getTypeName());
		return type;
	}
	
}
