package com.coding_dojo.dojos.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.coding_dojo.dojos.models.Dojo;

public interface DojoRepository extends CrudRepository <Dojo,Long> {
	List<Dojo> findAll();
}