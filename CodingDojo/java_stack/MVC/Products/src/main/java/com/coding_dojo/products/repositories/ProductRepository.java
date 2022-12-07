package com.coding_dojo.products.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.coding_dojo.products.models.Category;
import com.coding_dojo.products.models.Product;

public interface ProductRepository extends CrudRepository <Product,Long>{

    List<Product> findAll();
    
    // Retrieves a list of all products for a particular category
    List<Product> findAllByCategories(Category category);
    
    // Retrieves a list of any products a particular product
    // does not belong to.
    List<Product> findByCategoriesNotContains(Category category);

    
}
