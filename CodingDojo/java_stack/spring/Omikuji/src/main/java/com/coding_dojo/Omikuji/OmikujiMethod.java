package com.coding_dojo.Omikuji;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

@RequestMapping("/omikuji")
public class OmikujiMethod {
	
	@RequestMapping("")
	public String ind() {
		return "index.jsp";
	}
	
	
	@PostMapping("/confirm")
	public String your_omikuji(
		    @RequestParam(value="snack") Integer snack,
		    @RequestParam(value="city") String city, 
		    @RequestParam(value="person") String person,
		    @RequestParam(value="hoppy") String hoppy,
		    @RequestParam(value="things") String things,
		    @RequestParam(value="comment") String comment,HttpSession session) {
			session.setAttribute("snack", snack);
			session.setAttribute("city", city);
			session.setAttribute("person", person);
			session.setAttribute("hoppy", hoppy);
			session.setAttribute("things", things);
			session.setAttribute("comment", comment);
			
		return "redirect:/omikuji/show";
		}
	
	@RequestMapping("/show")
	public String ind2(HttpSession session) {
		session.getAttribute("snack");
		return "index1.jsp";
	}

	}

