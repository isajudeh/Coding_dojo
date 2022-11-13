package com.coding_dojo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coding_dojo.mvc.models.Book;
import com.coding_dojo.mvc.services.BookServices;

@Controller
public class BookController {
	@Autowired
	BookServices bookService;
	@GetMapping("/books/{bookId}")
		public String index(Model model,@PathVariable("bookId") Long bookId) {
		
			Book book = bookService.findBook(bookId);
			model.addAttribute("BookId",book);
			
			return "index.jsp" ;
	}
	
}
