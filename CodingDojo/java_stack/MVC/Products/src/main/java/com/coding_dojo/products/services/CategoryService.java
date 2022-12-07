package com.coding_dojo.products.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.coding_dojo.products.models.Category;
import com.coding_dojo.products.models.Product;
import com.coding_dojo.products.repositories.CategoryRepository;

@Service
public class CategoryService {
	private final CategoryRepository categoryRepository;
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	// returns all the Category
	public List<Category> allCategorys() {
	    return categoryRepository.findAll();
	}

	// creates a Category
	public Category createCategory(Category category) {
	    return categoryRepository.save(category);
	}
	// retrieves a Product
	public Category findCategory(Long id) {
	    Optional<Category> optionalCategory = categoryRepository.findById(id);
	    if(optionalCategory.isPresent()) {
	        return optionalCategory.get();
	    } else {
	        return null;
	    }
	}

	public List<Category> getAssignedProducts(Product product) {
		return categoryRepository.findAllByProducts(product);
	}

	public List<Category> getUnassignedProducts(Product product) {
		return categoryRepository.findByProductsNotContains(product);
	}
}

