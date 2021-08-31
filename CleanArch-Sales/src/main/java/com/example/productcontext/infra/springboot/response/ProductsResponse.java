package com.example.productcontext.infra.springboot.response;

import java.util.ArrayList;

import com.example.productcontext.domain.entities.Product;

public class ProductsResponse {

	private ArrayList<ProductResponse> products;
	
	public ProductsResponse() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductsResponse(ArrayList<Product> data) {
		products = new ArrayList<>();
		data.forEach(item -> products.add(new ProductResponse(item)));
	}

	public ArrayList<ProductResponse> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<ProductResponse> products) {
		this.products = products;
	}
	
	
	
	

}
