package com.coding_dojo.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coding_dojo.relationships.models.Person;
import com.coding_dojo.relationships.services.personService;

@Controller
public class relationshipsController {
	@Autowired
	personService personService;
	
	@RequestMapping("/persons/new")
	public String CreatePerson(Model model) {
		List<Person> persons = personService.allPersons();
	    model.addAttribute("persons", persons);
	    return "New.jsp";
	}
	@PostMapping("/person")
	public String create(@Valid @ModelAttribute("Person") Person person) {
	    	personService.createPerson(person);
	        return "redirect:/persons/{person_id}";
	    }
//	@RequestMapping("/licenses/new")
//	public String CreateLicense() {
//	    return "New1.jsp";
//	}
//	@PostMapping("/license")
//	public String create1(@Valid @ModelAttribute("License") Person license) {
//	    	personService.createPerson(license);
//	        return "redirect:/persons/{person_id}";
//	    }
//	@GetMapping("/persons/{person_id}")
//	public String showPerson(@PathVariable Long person_id, Model model) {
//	    Person someAwesomePerson = personService.findById(person_id);
//	    model.addAttribute("persons", someAwesomePerson);
//	    
//	    return "index.jsp";
//	}
}
