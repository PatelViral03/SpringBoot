package com.virus.shopingcart.categories.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.virus.shopingcart.categories.model.TypeCategory;
@Repository
public interface TypeCategoryRepository extends JpaRepository<TypeCategory, Integer> {

	@Query("FROM TypeCategory WHERE typeName=:name")
	TypeCategory typeIsExist(@Param("name") String typename);
}
