package com.coding_dojo.DisplayDate;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class method {
	@RequestMapping("/")
	public String ind() {
		return "index1.jsp";
	}
	
	@RequestMapping("/date")
	public String ind1(Model model) {
		Date date = new java.util.Date();
		model.addAttribute("da",date);
		return "index2.jsp";
	}
	@RequestMapping("/time")
	public String ind2() {
		
		return "index3.jsp";
	}
}