package com.example.productcontext.usecases;
import com.example.productcontext.domain.entities.Product;
import com.example.productcontext.usecases.interfaces.IProductGetter;


import java.util.ArrayList;


public class GetProducts {

	private IProductGetter getter;
	
	public GetProducts(IProductGetter getter) {
		this.getter = getter;
	}
	
	public ArrayList<Product> GetProducts() throws Exception {
		return getter.getProducts();
	}

}
