package com.example.Devapp.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Devapp.Entity.Users;

public interface UserRepo extends CrudRepository<Users,Integer> {

	
	Users findByUserId(String userId);

	Users save(Users user);
}
