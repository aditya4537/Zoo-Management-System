package com.example.zoomanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.zoomanagement.model.MedicalRecord;

@Repository
public interface MedicalRecordRepo extends JpaRepository<MedicalRecord, Long> {

}
