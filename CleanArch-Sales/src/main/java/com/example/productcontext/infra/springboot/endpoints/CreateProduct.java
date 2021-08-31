package com.example.productcontext.infra.springboot.endpoints;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.productcontext.infra.config.DBConfiguration;
import com.example.productcontext.infra.springboot.request.ProductData;
import com.example.productcontext.infra.springboot.response.ResponseMessage;
import com.example.productcontext.app.controllers.CreateProductController;

@RestController
public class CreateProduct {

	private CreateProductController controller;
	
	public CreateProduct() {
		 controller = new CreateProductController(DBConfiguration.PRODUCT_CREATOR_REPO);
	}
	
	@PostMapping(value = "/products",consumes = "application/json",produces = "application/json")
	public ResponseMessage createProduct(@RequestBody ProductData body) throws ResponseStatusException {
		try {
			if(body.isValid()) {
				controller.createProduct(body.getId(),body.getName(),body.getPrice());
				return new ResponseMessage("Product Created");
			}
				
			else 
				throw new Exception("InvalidRequest");
		}catch(Exception e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,e.getMessage(),e);
		}
		
		
	}

}
