package com.example.productcontext.app.controllers;

import com.example.productcontext.app.interfaces.IDBProductGetter;
import com.example.productcontext.app.services.GetProductsService;
import com.example.productcontext.usecases.GetProducts;
import com.example.productcontext.domain.entities.Product;
import java.util.ArrayList;

public class GetProductsController {
	
	private GetProducts productsObtainer;
	
	public GetProductsController(IDBProductGetter repository) {
		productsObtainer = new GetProducts(new GetProductsService(repository));
	}
	
	public ArrayList<Product> getProducts() throws Exception{
		return productsObtainer.GetProducts();
	}

}
