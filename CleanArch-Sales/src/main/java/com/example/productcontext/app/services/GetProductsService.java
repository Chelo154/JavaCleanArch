package com.example.productcontext.app.services;


import java.util.ArrayList;

import com.example.productcontext.domain.entities.Product;
import com.example.productcontext.app.interfaces.IDBProductGetter;
import com.example.productcontext.usecases.interfaces.IProductGetter;

public class GetProductsService implements IProductGetter {

	private IDBProductGetter getter;
	
	public GetProductsService(IDBProductGetter getter) {
		this.getter = getter;
	}

	@Override
	public ArrayList<Product> getProducts() throws Exception {		
		return getter.getProducts();
	}

}
