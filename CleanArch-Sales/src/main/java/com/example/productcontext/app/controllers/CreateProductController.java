package com.example.productcontext.app.controllers;

import com.example.productcontext.app.interfaces.IDBProductSaver;
import com.example.productcontext.app.services.SaveProductService;
import com.example.productcontext.usecases.CreateProduct;

public class CreateProductController {

	private CreateProduct productCreator;
	
	public CreateProductController(IDBProductSaver repository) {
		productCreator = new CreateProduct(new SaveProductService(repository));
	}
	
	public void createProduct(int id, String name, double price) throws Exception{
		productCreator.create(id,name,price);
	}

}
