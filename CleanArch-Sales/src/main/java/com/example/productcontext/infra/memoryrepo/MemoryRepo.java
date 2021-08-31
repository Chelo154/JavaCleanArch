package com.example.productcontext.infra.memoryrepo;

import java.util.ArrayList;

import com.example.productcontext.domain.entities.Product;
import com.example.productcontext.app.interfaces.IDBProductGetter;
import com.example.productcontext.app.interfaces.IDBProductSaver;

public class MemoryRepo implements IDBProductSaver,IDBProductGetter {

	private ArrayList<Product> products;
	
	public MemoryRepo() {
		products = new ArrayList<>();
	}

	@Override
	public void save(Product p) throws Exception {
		products.add(p);		
	}

	@Override
	public ArrayList<Product> getProducts() {
		// TODO Auto-generated method stub
		return products;
	}

}
