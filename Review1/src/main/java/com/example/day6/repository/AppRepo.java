package com.example.day6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day6.model.ApplianceBook;

public interface AppRepo extends JpaRepository<ApplianceBook, Integer>{

}
