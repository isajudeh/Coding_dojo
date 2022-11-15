package com.coding_dojo.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coding_dojo.mvc.models.Book;
import com.coding_dojo.mvc.services.BookService;

@Controller
public class BooksController {

 private final BookService bookService;
 
 public BooksController(BookService bookService) {
     this.bookService = bookService;
 }
 
 @RequestMapping("/book")
 public String index(Model model) {
     List<Book> books = bookService.allBooks();
     model.addAttribute("books", books);
     return "index1.jsp";
 }
 @GetMapping("/books/new")
 public String newBook(@ModelAttribute("book") Book book) {
     return "/index2.jsp";
 }
 @PostMapping("/books")
 public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
     if (result.hasErrors()) {
         return "/index2.jsp";
     } else {
         bookService.createBook(book);
         return "redirect:/book";
     }
 }
 
 @GetMapping("/books/{id}/edit")
 public String edit(@PathVariable("id") Long id, Model model) {
     Book book = bookService.findBook(id);
     model.addAttribute("book", book);
     return "/edit.jsp";
 }
 
 @PostMapping("/books/{id}")
 public String update(@Valid @ModelAttribute("book") Book book, BindingResult result) {
     if (result.hasErrors()) {
         return "edit.jsp";
     } else {
         bookService.updateBook(book);
         return "redirect:/book";
     }
 }
}

