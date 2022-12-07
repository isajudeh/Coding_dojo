package com.coding_dojo.products.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.coding_dojo.products.models.Product;
import com.coding_dojo.products.repositories.ProductRepository;

@Service
public class ProductService {
	private final ProductRepository productRepository;
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	//Update a Language
	public Product updateProduct(Product b) {
	    return productRepository.save(b);
	}

	// returns all the Product
	public List<Product> allProducts() {
	    return productRepository.findAll();
	}
	// creates a Product
	public Product createProduct(Product product) {
	    return productRepository.save(product);
	}
	// retrieves a Product
	public Product findProduct(Long id) {
	    Optional<Product> optionalProduct = productRepository.findById(id);
	    if(optionalProduct.isPresent()) {
	        return optionalProduct.get();
	    } else {
	        return null;
	    }
	}
}
