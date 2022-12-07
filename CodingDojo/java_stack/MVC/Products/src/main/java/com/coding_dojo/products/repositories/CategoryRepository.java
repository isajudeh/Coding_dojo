package com.coding_dojo.products.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.coding_dojo.products.models.Category;
import com.coding_dojo.products.models.Product;

public interface CategoryRepository extends CrudRepository <Category,Long> {

	// Retrieves a list of all categories for a particular product
    List<Category> findAllByProducts(Product product);
    
    // Retrieves a list of any categories a particular product
    // does not belong to.
    List<Category> findByProductsNotContains(Product product);
    
    List<Category> findAll();
}
