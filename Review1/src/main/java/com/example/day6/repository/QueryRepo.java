package com.example.day6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day6.model.QueryModal;

public interface QueryRepo extends JpaRepository<QueryModal, Integer>{

}
