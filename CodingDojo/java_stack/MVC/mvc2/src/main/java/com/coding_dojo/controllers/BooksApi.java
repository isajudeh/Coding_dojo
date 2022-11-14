package com.coding_dojo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coding_dojo.mvc.models.Book;
import com.coding_dojo.mvc.services.BookServices;
@RestController
public class BooksApi {
 private final BookServices bookService;
 public BooksApi(BookServices bookService){
     this.bookService = bookService;
 }

 @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
 public Book update(@PathVariable("id") Long id, 
		 @RequestParam(value="title") String title, 
		 @RequestParam(value="description") String desc, 
		 @RequestParam(value="language") String lang, 
		 @RequestParam(value="pages") Integer numOfPages
		 ) {
		Book book = new Book(title, desc, lang, numOfPages);
		book.setId(id);
		Book updatedBook = bookService.updateBook(book);
     return updatedBook;
 }

 @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
 public void destroy(@PathVariable("id") Long id) {
     bookService.deleteBook(id);
 }
 
}
