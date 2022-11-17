package com.coding_dojo.dojos.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.coding_dojo.dojos.models.Dojo;
import com.coding_dojo.dojos.repositories.DojoRepository;

@Service
public class DojoService {
	
	private final DojoRepository dojoRepository;
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
/////////////////////////////////////////////////////////////////////////
	// returns all the Dojo
	public List<Dojo> allDojos() {
	    return dojoRepository.findAll();
	}

	// creates a Dojo
	public Dojo createDojo(Dojo dojo) {
	    return dojoRepository.save(dojo);
	}

	//Delete a Dojo
	public void deleteDojo(Long id) {
		dojoRepository.deleteById(id);
	}

	//Update a Dojo
	public Dojo updateLanguage(Dojo dojo) {
	    return dojoRepository.save(dojo);
	}

	// retrieves a book
	public Dojo findDojo(Long id) {
	    Optional<Dojo> optionalDojo = dojoRepository.findById(id);
	    if(optionalDojo.isPresent()) {
	        return optionalDojo.get();
	    } else {
	        return null;
	    }
	}
	
}
