package com.example.zoomanagement.model;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animals {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long animalId;
	
	private String name;
	
	private String species;
	
	private int age;
	
	private String gender;
	
	private Date dateOfBirth;
	
	private Date dateAcquired;
	
	@ManyToOne
	private Enclosure enclosure;
	
	@OneToMany(mappedBy = "animalF", cascade = CascadeType.ALL)
	private Set<FeedingSchedule> feedingSchedule;
	
	@OneToMany(mappedBy = "animalM", cascade = CascadeType.ALL)
	private Set<MedicalRecord> medicalRecord;
}
