package com.coding_dojo.test2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class test2 {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
}
