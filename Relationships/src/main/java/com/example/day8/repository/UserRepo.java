package com.example.day8.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day8.model.UserModal;

public interface UserRepo extends JpaRepository<UserModal, Long>{
	
}
