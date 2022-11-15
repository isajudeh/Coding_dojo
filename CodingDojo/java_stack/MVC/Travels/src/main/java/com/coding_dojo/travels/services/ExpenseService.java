package com.coding_dojo.travels.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.coding_dojo.travels.models.Expense;
import com.coding_dojo.travels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	 // adding the ExpenseRepository as a dependency
	private final ExpenseRepository expenseRepository;
	public ExpenseService(ExpenseRepository expenseRepository) {
	     this.expenseRepository = expenseRepository;
	 }
	 
	 // returns all the Expense
	 public List<Expense> allExpense() {
	     return expenseRepository.findAll();
	 }
	 
	 // creates a Expense
	 public Expense createExpense(Expense E) {
	     return expenseRepository.save(E);
	 }
	 
	 //Delete a Expense
	 public void deleteExpense(Long id) {
		 expenseRepository.deleteById(id);
	 }
	 
	 //Update a Expense
	 public Expense updateExpense(Expense E) {
	     return expenseRepository.save(E);
	 }
	 
	 // retrieves a book
	 public Expense findExpense(Long id) {
	     Optional<Expense> optionalExpense = expenseRepository.findById(id);
	     if(optionalExpense.isPresent()) {
	         return optionalExpense.get();
	     } else {
	         return null;
	     }
	 }
	 
}
