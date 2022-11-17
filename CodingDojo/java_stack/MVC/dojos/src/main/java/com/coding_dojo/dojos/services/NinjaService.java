package com.coding_dojo.dojos.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.coding_dojo.dojos.models.Ninja;
import com.coding_dojo.dojos.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	private final NinjaRepository ninjaRepository;
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
/////////////////////////////////////////////////////////////////////////
// returns all the Ninja
public List<Ninja> allNinjas() {
return ninjaRepository.findAll();
}

// creates a Ninja
public Ninja createNinja(Ninja ninja) {
return ninjaRepository.save(ninja);
}

//Delete a Ninja
public void deleteNinja(Long id) {
	ninjaRepository.deleteById(id);
}

//Update a Ninja
public Ninja updateNinja(Ninja ninja) {
return ninjaRepository.save(ninja);
}

// retrieves a Ninja
public Ninja findNinja(Long id) {
Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
if(optionalNinja.isPresent()) {
return optionalNinja.get();
} else {
return null;
}
}

}
