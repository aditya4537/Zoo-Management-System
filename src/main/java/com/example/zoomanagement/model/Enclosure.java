package com.example.zoomanagement.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Enclosure {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long enclosureId;
	
	private String name;
	
	private String type;
	
	private int capacity;
	
	private int currentOccupancy;
	
	@OneToMany(mappedBy = "enclosure", cascade = CascadeType.ALL)
	private Set<Animals> animalE;
}
