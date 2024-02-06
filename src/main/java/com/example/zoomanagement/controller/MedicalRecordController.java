package com.example.zoomanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zoomanagement.model.MedicalRecord;
import com.example.zoomanagement.service.MedicalRecordService;

@RestController
@RequestMapping("/medicalRecord")
public class MedicalRecordController {

	@Autowired
	private MedicalRecordService medicalRecordService;
	
	@GetMapping("/getAllMedicalRecords")
	public List<MedicalRecord> getAllMedicalRecords(){
		return medicalRecordService.getAllMedicalRecords();
	}

	@GetMapping("/getMedicalRecord/{id}")
	public Optional<MedicalRecord> getMedicalRecord(@PathVariable long id){
		return medicalRecordService.getMedicalRecordById(id);
	}
	
	@PostMapping("/addMedicalRecord")
	public MedicalRecord addMedicalRecord(@RequestBody MedicalRecord medicalRecord) {
		return medicalRecordService.addMedicalRecord(medicalRecord);
	}
	
	@DeleteMapping("deleteMedicalRcord/{id}")
	public Optional<MedicalRecord> deleteMedicalRecord(@PathVariable long id){
		return medicalRecordService.deleteMedicalRecordById(id);
	}
	
}
