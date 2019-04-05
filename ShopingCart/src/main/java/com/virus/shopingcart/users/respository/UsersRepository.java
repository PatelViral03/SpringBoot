package com.virus.shopingcart.users.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virus.shopingcart.users.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
