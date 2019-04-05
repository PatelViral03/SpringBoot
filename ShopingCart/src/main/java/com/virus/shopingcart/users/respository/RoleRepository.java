package com.virus.shopingcart.users.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virus.shopingcart.users.model.Roles;

public interface RoleRepository extends JpaRepository<Roles, Integer> {

}
