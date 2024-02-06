package com.example.zoomanagement.service;

import java.util.List;
import java.util.Optional;

import com.example.zoomanagement.model.MedicalRecord;

public interface MedicalRecordService {

	public List<MedicalRecord> getAllMedicalRecords();
	
	public Optional<MedicalRecord> getMedicalRecordById(long id);
	
	public MedicalRecord addMedicalRecord(MedicalRecord medicalRecord);
	
	public Optional<MedicalRecord> deleteMedicalRecordById(long id);
}
