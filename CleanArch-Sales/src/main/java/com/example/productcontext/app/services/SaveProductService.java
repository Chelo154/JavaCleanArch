package com.example.productcontext.app.services;

import com.example.productcontext.domain.entities.Product;
import com.example.productcontext.app.interfaces.IDBProductSaver;
import com.example.productcontext.usecases.interfaces.IProductSaver;

public class SaveProductService implements IProductSaver {
	
	private IDBProductSaver repository;

	public SaveProductService(IDBProductSaver repository) {
		this.repository = repository;
	}

	@Override
	public void save(Product p) throws Exception {
		
		repository.save(p);
		
	}

}
