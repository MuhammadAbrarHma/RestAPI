package com.example.day7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day7.model.Fruits;

public interface FruitRepo extends JpaRepository<Fruits, Integer>{

}
