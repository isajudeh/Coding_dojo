package com.coding_dojo.Counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class visit {
	@RequestMapping("/")	
	public String index(HttpSession session) {
    	// If the count is not already in session
		if (session.getAttribute("count") == null) {
		// Use setAttribute to initialize the count in session
			session.setAttribute("count", 0);
		}
		else {
		// increment the count by 1 using getAttribute and setAttribute
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount+=1;
			session.setAttribute("count", currentCount);
		}
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String index1(HttpSession session,Model model) {
		Integer currentCount = (Integer) session.getAttribute("count");
		model.addAttribute("countToShow", currentCount);
		return "index1.jsp";
	}
}