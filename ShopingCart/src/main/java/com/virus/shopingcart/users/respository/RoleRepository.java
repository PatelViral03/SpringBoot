package com.virus.shopingcart.users.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.virus.shopingcart.users.model.Roles;

public interface RoleRepository extends JpaRepository<Roles, Integer> {

	@Query("FROM Roles where roleName=:name")
	public Roles isExistRole(@Param("name") String name);
	
}
