package com.test.democompliance.controllers;


import org.junit.jupiter.api.Test;

import com.test.democompliance.model.Product;

public class PrductControllerTest {

	private PrductController createTestSubject() {
		return new PrductController();
	}

	@Test
	public void testCreateProduct() throws Exception {
		 Product product = new Product();
	product.setProduct_name("samsung");
	product.setProduct_price("300");
	        
	        PrductController testSubject;
		Product product = null;
		Response result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.createProduct(product);
	}
}