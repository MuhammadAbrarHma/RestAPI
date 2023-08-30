package com.example.day6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day6.model.ApplianceCustomer;

public interface AppCust extends JpaRepository<ApplianceCustomer, Integer>{

}
