package com.example.productcontext.usecases.interfaces;

import java.util.ArrayList;

import com.example.productcontext.domain.entities.Product;

public interface IProductGetter {

	public ArrayList<Product> getProducts() throws Exception;	
}
