package com.virus.shopingcart.categories.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.virus.shopingcart.categories.model.Categories;
@Repository
public interface CategoryRepository extends JpaRepository<Categories, Integer> {

	@Query("FROM Categories where name=:name")
	public Categories getByName(@Param("name") String name);
}
