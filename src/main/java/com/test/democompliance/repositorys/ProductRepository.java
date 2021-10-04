package com.test.democompliance.repositorys;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.test.democompliance.model.Product;

@Component
public interface ProductRepository extends CrudRepository<Product, Integer>{
	


}
