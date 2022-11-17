package com.coding_dojo.dojos.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.coding_dojo.dojos.models.Ninja;

public interface NinjaRepository extends CrudRepository <Ninja,Long> {
	List<Ninja> findAll();
}