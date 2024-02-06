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

import com.example.zoomanagement.model.Enclosure;
import com.example.zoomanagement.service.EnclosureService;

@RestController
@RequestMapping("/enclosure")
public class EnclosureController {

	@Autowired
	private EnclosureService enclosureService;
	
	@GetMapping("/getAllEnclosures")
	public List<Enclosure> getAllEnclosure(){
		return enclosureService.getAllEnclosures();
	}

	@GetMapping("/getEnclosureById/{id}")
	public Optional<Enclosure> getEnclosure(@PathVariable long id){
		return enclosureService.getEnclosureById(id);
	}
	
	@PostMapping("/addEnclosure")
	public Enclosure addEnclosure(@RequestBody Enclosure Enclosure) {
		return enclosureService.addEnclosure(Enclosure);
	}
	
	@DeleteMapping("/deleteEnclosure/{id}")
	public Optional<Enclosure> deleteEnclosure(@PathVariable long id){
		return enclosureService.deleteEnclosureById(id);
	}
}
