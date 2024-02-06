package com.example.zoomanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zoomanagement.model.Enclosure;
import com.example.zoomanagement.repository.EnclosureRepo;
import com.example.zoomanagement.service.EnclosureService;

@Service
public class EnclosureServiceImpl implements EnclosureService{
	
	@Autowired
	private EnclosureRepo enclosureRepo;

	@Override
	public List<Enclosure> getAllEnclosures() {
		return enclosureRepo.findAll();
	}

	@Override
	public Optional<Enclosure> getEnclosureById(long id) {
		return enclosureRepo.findById(id);
	}

	@Override
	public Enclosure addEnclosure(Enclosure enclosure) {
		return enclosureRepo.save(enclosure);
	}

	@Override
	public Optional<Enclosure> deleteEnclosureById(long id) {
		Optional<Enclosure> enclosure = enclosureRepo.findById(id);
		enclosureRepo.deleteById(id);
		return enclosure;
	}

}
