package com.example.zoomanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zoomanagement.model.Animals;
import com.example.zoomanagement.repository.AnimalRepo;
import com.example.zoomanagement.service.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService {
	
	@Autowired
	private AnimalRepo animalRepo;

	@Override
	public List<Animals> getAllAnimals() {
		return animalRepo.findAll();
	}

	@Override
	public Optional<Animals> getAnimalById(long id) {
		return animalRepo.findById(id);
	}

	@Override
	public Animals addAnimal(Animals animal) {
		return animalRepo.save(animal);
	}

	@Override
	public Optional<Animals> deleteAnimalById(long id) {
		Optional<Animals> animal = animalRepo.findById(id);
		animalRepo.deleteById(id);
		return animal;
	}

}
