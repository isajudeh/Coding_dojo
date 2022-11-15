package com.coding_dojo.languages.controllers;

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

import com.coding_dojo.languages.models.language;
import com.coding_dojo.languages.services.LanguageService;

@Controller
public class LanguageController {
@Autowired
LanguageService languageService;
///////////////////////////////////////////////////////////////////////////////////////

@GetMapping("/languages")
public String newBook( @ModelAttribute("language") language lang,Model model) {
    List<language> language1 = languageService.allLanguages();
    model.addAttribute("languagesss", language1);
    return "/dashboard.jsp";
}
@PostMapping("/langlang")
public String create(@Valid @ModelAttribute("language") language language, BindingResult result) {
    if (result.hasErrors()) {
        return "/dashboard.jsp";
    } else {
    	languageService.createLanguage(language);
        return "redirect:/languages";
    }
}
@GetMapping("/languages/edit/{id}")
public String edit(@PathVariable("id") Long id, Model model) {
	language lang = languageService.findLanguage(id);
    model.addAttribute("language", lang);
    return "/edit.jsp";
}
@PostMapping("/lang/{id}")
public String update(@Valid @ModelAttribute("language") language language, BindingResult result) {
    if (result.hasErrors()) {
        return "/dashboard.jsp";
    } else {
    	languageService.updateLanguage(language);
        return "redirect:/languages";
    }
}
//@PostMapping("/books/{id}")
//public String update(@Valid @ModelAttribute("book") Book book, BindingResult result) {
//    if (result.hasErrors()) {
//        return "edit.jsp";
//    } else {
//        bookService.updateBook(book);
//        return "redirect:/book";
//    }
//}
//@GetMapping("/books/{id}/delete")
//public String destroy(@PathVariable("id") Long id) {
//	bookService.deleteBook(id);
//	return "redirect:/book";
//    }
///////////////////////////////////////////////////////////////////////////////////////
}