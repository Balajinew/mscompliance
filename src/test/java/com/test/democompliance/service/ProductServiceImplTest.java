package com.test.democompliance.service;



import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.democompliance.model.Product;
import com.test.democompliance.repositorys.ProductRepository;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class ProductServiceImplTest {

	@Mock
	private ProductRepository repository;

	@Autowired
	private ProductService service;
	@Test
	public void testCreateProduct_success() throws Exception {
		 Product product = new Product();
			product.setProduct_name("samsung");
			product.setProduct_price("300");
			        
			String productData = service.createProduct(product);
			
	        assertThat(productData).isNotNull();


	}

	@Test
	public void testCreateProduct_failure() throws Exception {
		 Product product = new Product();
			product.setProduct_name("samsung");
			product.setProduct_price("300");
			        
			String productData = service.createProduct(product);
			
	        assertThat(productData).isNotNull();


	}
	
}