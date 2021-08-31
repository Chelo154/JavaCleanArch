package com.example.productcontext.app.interfaces;

import java.util.ArrayList;

import com.example.productcontext.domain.entities.Product;

public interface IDBProductGetter {
	
	public ArrayList<Product> getProducts()throws Exception;

}
