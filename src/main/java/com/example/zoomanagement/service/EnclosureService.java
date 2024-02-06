package com.example.zoomanagement.service;

import java.util.List;
import java.util.Optional;

import com.example.zoomanagement.model.Enclosure;

public interface EnclosureService {

	public List<Enclosure> getAllEnclosures();

	public Optional<Enclosure> getEnclosureById(long id);

	public Enclosure addEnclosure(Enclosure enclosure);

	public Optional<Enclosure> deleteEnclosureById(long id);
}
