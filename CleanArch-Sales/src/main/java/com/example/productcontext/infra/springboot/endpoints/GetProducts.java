package com.example.productcontext.infra.springboot.endpoints;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.productcontext.app.controllers.GetProductsController;
import com.example.productcontext.infra.config.DBConfiguration;
import com.example.productcontext.infra.springboot.response.ProductsResponse;

@RestController
public class GetProducts {

	private GetProductsController controller;
	
	public GetProducts() {
		controller = new GetProductsController(DBConfiguration.PRODUCT_GETTER_REPO);
	}
	
	@GetMapping(value="/products",consumes = "application/json", produces="application/json")
	public ProductsResponse getProducts() {
		try {
			return new ProductsResponse(controller.getProducts());
		}catch(Exception e) {
			System.out.println(e.getMessage());
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,e.getMessage(),e);
		}
	}

}
