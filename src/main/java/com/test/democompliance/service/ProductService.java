package com.test.democompliance.service;

import org.springframework.stereotype.Service;

import com.test.democompliance.model.Product;


public interface ProductService {

	public String createProduct(Product product);
	public Product getProduct();
}
