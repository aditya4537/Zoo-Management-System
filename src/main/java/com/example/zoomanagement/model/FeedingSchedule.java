package com.example.zoomanagement.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeedingSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long scheduleId;
	
	private LocalDateTime feedingTime;
	
	private String feedingType;
	
	private String foodType;
	
	@ManyToOne
	private Animals animalF;
}
