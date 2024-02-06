package com.example.zoomanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.zoomanagement.model.Animals;

@Repository
public interface AnimalRepo extends JpaRepository<Animals, Long> {

}
