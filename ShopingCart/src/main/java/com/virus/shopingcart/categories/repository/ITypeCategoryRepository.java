package com.virus.shopingcart.categories.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.virus.shopingcart.categories.model.TypeCategory;

public interface ITypeCategoryRepository extends JpaRepository<TypeCategory, Integer> {

	@Query("FROM TypeCategory WHERE typeName=:name")
	TypeCategory typeIsExist(@Param("name") String typename);
}
