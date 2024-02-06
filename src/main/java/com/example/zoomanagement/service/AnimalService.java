package com.example.zoomanagement.service;

import java.util.List;
import java.util.Optional;

import com.example.zoomanagement.model.Animals;

public interface AnimalService {

	public List<Animals> getAllAnimals();
	
	public Optional<Animals> getAnimalById(long id);
	
	public Animals addAnimal(Animals animal);
	
	public Optional<Animals> deleteAnimalById(long id);
}
