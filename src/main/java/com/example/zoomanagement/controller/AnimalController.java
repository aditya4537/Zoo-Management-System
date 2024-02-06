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

import com.example.zoomanagement.model.Animals;
import com.example.zoomanagement.service.AnimalService;

@RestController
@RequestMapping("/animal")
public class AnimalController {
	
	@Autowired
	private AnimalService animalService;
	
	@GetMapping("/getAllAnimals")
	public List<Animals> getAllAnimals(){
		return animalService.getAllAnimals();
	}

	@GetMapping("/getAnimalById/{id}")
	public Optional<Animals> getAnimal(@PathVariable long id){
		return animalService.getAnimalById(id);
	}
	
	@PostMapping("/addAnimal")
	public Animals addAnimal(@RequestBody Animals animal) {
		return animalService.addAnimal(animal);
	}
	
	@DeleteMapping("/deleteAnimal/{id}")
	public Optional<Animals> deleteAnimal(@PathVariable long id){
		return animalService.deleteAnimalById(id);
	}
	
}
