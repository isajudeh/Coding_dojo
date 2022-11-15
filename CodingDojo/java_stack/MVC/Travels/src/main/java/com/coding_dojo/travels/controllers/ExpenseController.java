package com.coding_dojo.travels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.coding_dojo.travels.models.Expense;
import com.coding_dojo.travels.services.ExpenseService;

@Controller
public class ExpenseController {
	@Autowired
	 ExpenseService expenseService;

	 @GetMapping("/expense")
	 public String index(Model model, @ModelAttribute("Expenses") Expense expense) {
	     List<Expense> expense1 = expenseService.allExpense();
	     model.addAttribute("Expenses", expense1);
	     return "index.jsp";
	 }

	 @PostMapping("/expense1")
	 public String create(@Valid @ModelAttribute("Expenses") Expense expense, BindingResult result) {
	     if (result.hasErrors()) {
	         return "/index.jsp";
	     } else {
	    	 expenseService.createExpense(expense);
	         return "redirect:/expense";
	     }
	 }
}
