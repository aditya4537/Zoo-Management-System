package com.example.zoomanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.zoomanagement.model.Enclosure;

@Repository
public interface EnclosureRepo extends JpaRepository<Enclosure, Long> {

}
