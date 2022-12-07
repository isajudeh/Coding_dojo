package com.coding_dojo.products.controllers;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.coding_dojo.products.models.Category;
import com.coding_dojo.products.models.Product;
import com.coding_dojo.products.services.CategoryService;
import com.coding_dojo.products.services.ProductService;

@Controller
public class MainController {
	@Autowired
	CategoryService categoryService;
	@Autowired
	ProductService productService;
/////////////////////////////////////////////////////////////////////////////////
	@GetMapping("/")
	public String main( @ModelAttribute("product") Product product,@ModelAttribute("category") Category category,Model model) {
	    List<Category> category1 = categoryService.allCategorys();
	    model.addAttribute("CATEGORY", category1);
	    
	    List<Product> product1 = productService.allProducts();
	    model.addAttribute("PRODUCT", product1);
	    
	    return "/HomePage.jsp";
	}
/////////////////////////////////////////////////////////////////////////////////
	@GetMapping("/products/new")
	public String NewProduct( @ModelAttribute("product") Product product,Model model) {
	    return "/NewProduct.jsp";
	}
	@PostMapping("/products/new")
	public String createNewProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
	    if (result.hasErrors()) {
	        return "/NewProduct.jsp";
	    } else {
	    	productService.createProduct(product);
	        return "redirect:/";
	    }
	}
/////////////////////////////////////////////////////////////////////////////////
	@GetMapping("/catrgories/new")
	public String NewCategory( @ModelAttribute("category") Category category,Model model) {
	    return "/NewCategory.jsp";
	}
	@PostMapping("/catrgories/new")
	public String createNewCAtegory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
	    if (result.hasErrors()) {
	        return "/NewCategory.jsp";
	    } else {
	    	categoryService.createCategory(category);
	        return "redirect:/";
	    }
	}
/////////////////////////////////////////////////////////////////////////////////
	@GetMapping("/products/{id}")
	public String showProduct(@PathVariable("id") Long id, Model model) {
		Product product = productService.findProduct(id);
		model.addAttribute("assignedCategories", categoryService.getAssignedProducts(product));
		model.addAttribute("unassignedCategories", categoryService.getUnassignedProducts(product));
		model.addAttribute("product", product);
		return "show_product.jsp";
	}
	
	@PostMapping("/products/{id}")
	public String editProduct(@PathVariable("id") Long id, @RequestParam(value="categoryId") Long catId,  Model model) {
		Product product = productService.findProduct(id);
		Category category = categoryService.findCategory(catId);
		product.getCategories().add(category);
		productService.updateProduct(product);
		model.addAttribute("assignedCategories", categoryService.getAssignedProducts(product));
		model.addAttribute("unassignedCategories", categoryService.getUnassignedProducts(product));
		return "redirect:/products/" + id;
	}
/////////////////////////////////////////////////////////////////////////////////
	}