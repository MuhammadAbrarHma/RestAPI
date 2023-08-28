package com.example.day.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day.modal.SwagModal;

public interface SwagRepo extends JpaRepository<SwagModal, Integer> {

}
