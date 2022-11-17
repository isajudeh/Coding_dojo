package com.coding_dojo.relationships.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.coding_dojo.relationships.models.Person;

@Repository
public interface relationshipsRepository extends CrudRepository<Person,Long>{
	
    // this method retrieves all the books from the database
    List<Person> findAll();
    // this method delete person by id 
    void deleteById(Long id);
 // this method find person by id 
    Optional<Person> findById(Long id);
}