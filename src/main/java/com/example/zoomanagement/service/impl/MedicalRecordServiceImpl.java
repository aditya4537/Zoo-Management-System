package com.example.zoomanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zoomanagement.model.MedicalRecord;
import com.example.zoomanagement.repository.MedicalRecordRepo;
import com.example.zoomanagement.service.MedicalRecordService;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {

	@Autowired
	private MedicalRecordRepo medicalRecordRepo;
	
	@Override
	public List<MedicalRecord> getAllMedicalRecords() {
		return medicalRecordRepo.findAll();
	}

	@Override
	public Optional<MedicalRecord> getMedicalRecordById(long id) {
		return medicalRecordRepo.findById(id);
	}

	@Override
	public MedicalRecord addMedicalRecord(MedicalRecord medicalRecord) {
		return medicalRecordRepo.save(medicalRecord);
	}

	@Override
	public Optional<MedicalRecord> deleteMedicalRecordById(long id) {
		Optional<MedicalRecord> medicalRecord = medicalRecordRepo.findById(id);
		medicalRecordRepo.deleteById(id);
		return medicalRecord;
	}

}
