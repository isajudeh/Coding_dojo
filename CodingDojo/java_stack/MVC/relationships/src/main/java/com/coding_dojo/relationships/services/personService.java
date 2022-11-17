package com.coding_dojo.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.coding_dojo.relationships.models.Person;
import com.coding_dojo.relationships.repositories.relationshipsRepository;
@Service
public class personService {

	private final relationshipsRepository relationshipsRepository;
	 public personService(relationshipsRepository relationshipsRepository) {
	     this.relationshipsRepository = relationshipsRepository;
	 }
	 
	 public List<Person> allPersons() {
	     return relationshipsRepository.findAll();
	 }
	 
	 public Person createPerson(Person b) {
	     return relationshipsRepository.save(b);
	 }
	 
	 public void deletePerson(Long id) {
		 relationshipsRepository.deleteById(id);
	 }
	 
	 public Person updatePerson(Person b) {
	     return relationshipsRepository.save(b);
	 }
	 
	 public Person findById(Long id) {
	     Optional<Person> optionalPerson = relationshipsRepository.findById(id);
	     if(optionalPerson.isPresent()) {
	         return optionalPerson.get();
	     } else {
	         return null;
	     }
	 }
	 
	}