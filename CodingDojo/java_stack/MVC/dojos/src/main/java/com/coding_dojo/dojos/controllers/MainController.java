package com.coding_dojo.dojos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.coding_dojo.dojos.models.Dojo;
import com.coding_dojo.dojos.models.Ninja;
import com.coding_dojo.dojos.services.DojoService;
import com.coding_dojo.dojos.services.NinjaService;

@Controller
public class MainController {
	@Autowired
	DojoService dojoService;
	@Autowired
	NinjaService ninjaService;

/////////////////////////////////////////////////////////////
	@GetMapping("/")
	public String main( @ModelAttribute("dojo") Dojo dojo,Model model) {
	    List<Dojo> dojo1 = dojoService.allDojos();
	    model.addAttribute("DOJOS", dojo1);
	    return "/MainShow.jsp";
	}
/////////////////////////////////////////////////////////////
	@GetMapping("/dojos/new")
	public String newDojo( @ModelAttribute("dojoo") Dojo dojo,Model model) {

	    return "/NewDojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String createNewDojo(@Valid @ModelAttribute("dojoo") Dojo dojo, BindingResult result) {
	    if (result.hasErrors()) {
	        return "/NewDojo.jsp";
	    } else {
	    	dojoService.createDojo(dojo);
	        return "redirect:/";
	    }
	}	
/////////////////////////////////////////////////////////////	
	@GetMapping("/ninjas/new")
	public String newNinja( @ModelAttribute("ninjaa") Ninja ninja,Model model) {
	    List<Dojo> dojo1 = dojoService.allDojos();
	    model.addAttribute("DOJOS", dojo1);
	    return "/NewNinja.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String createNewNinja(@Valid @ModelAttribute("ninjaa") Ninja ninja, BindingResult result) {
	    if (result.hasErrors()) {
	        return "/NewNinja.jsp";
	    } else {
	    	ninjaService.createNinja(ninja);
	        return "redirect:/";
	    }
	}
/////////////////////////////////////////////////////////////	
	@GetMapping("/dojos/{id}")
	public String main3(@PathVariable("id") Long id,Model model) {
	    Dojo dojo1 = dojoService.findDojo(id);
	    model.addAttribute("DOJOS", dojo1);
	    return "/ShowNinjas.jsp";
	}
/////////////////////////////////////////////////////////////	
	
}