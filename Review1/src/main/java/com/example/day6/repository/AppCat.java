package com.example.day6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day6.model.ApplianceCategory;

public interface AppCat extends JpaRepository<ApplianceCategory, Integer>{

}
