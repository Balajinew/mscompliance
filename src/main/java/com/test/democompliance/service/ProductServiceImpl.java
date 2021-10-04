package com.test.democompliance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.test.democompliance.model.Product;
import com.test.democompliance.repositorys.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository repository;
	
	@Override
	public String createProduct(Product product) {
		Product productData = repository.save(product);
		if(productData!=null)
		{
		return "Success";
		}
		else
		{
			return "Failure";
		}
	}

	@Override
	public Product getProduct() {
		List<Product> productList = (List<Product>) repository.findAll();
		
		Product result = productList.get(0);
		return result;
	}
}
