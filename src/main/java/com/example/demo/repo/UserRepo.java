package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dao.User;

public interface UserRepo extends JpaRepository<User, Long>{
	

}
