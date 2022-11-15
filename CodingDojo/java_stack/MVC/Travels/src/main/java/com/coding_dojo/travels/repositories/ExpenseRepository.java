package com.coding_dojo.travels.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.coding_dojo.travels.models.Expense;

public interface ExpenseRepository extends CrudRepository<Expense,Long>{
	
    List<Expense> findAll();
    List<Expense> findByDescriptionContaining(String search);
    Long countByTitleContaining(String search);
    Long deleteByTitleStartingWith(String search);
    
}