package com.example.day7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day7.model.TransModel;

public interface TransRepo extends JpaRepository<TransModel, Integer>{

}
