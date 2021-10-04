package com.test.democompliance.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.test.democompliance.model.Product;
import com.test.democompliance.model.Response;
import com.test.democompliance.service.ProductService;

import io.swagger.annotations.ApiOperation;

@RestController
public class PrductController {
	
	@Autowired
	private ProductService service;
	
	 @RequestMapping(value = "/products/create", method = RequestMethod.POST)
	@ApiOperation(value = "Respond Hello <name>!", notes = "Returns a JSON object with a string to say hello. "
			+ "Uses 'world' if a name is not specified", response = Response.class)

	public Response createProduct(@RequestBody Product product)
	{
		Response output = new Response();
		output.setResponse(service.createProduct(product));
		return output;
	}
	
	 @RequestMapping(value = "/products", method = RequestMethod.GET)
	 @ApiOperation(value = "Respond Hello <name>!", notes = "Returns a JSON object with a string to say hello. "
			+ "Uses 'world' if a name is not specified", response = Response.class)

	public Product getProduct()
	{
		return service.getProduct();
	}

}
