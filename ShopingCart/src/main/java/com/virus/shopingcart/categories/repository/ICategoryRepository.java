package com.virus.shopingcart.categories.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virus.shopingcart.categories.model.Categories;

public interface ICategoryRepository extends JpaRepository<Categories, Integer> {

}
