package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
	
	Users findByEmail(String email);
	Users findByUsername(String username);

}
