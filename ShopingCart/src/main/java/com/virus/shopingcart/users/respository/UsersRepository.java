package com.virus.shopingcart.users.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.virus.shopingcart.users.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

	@Query("FROM Users where email=:email")
	public Users isUserExist(@Param("email") String email);
	
	
}
