package com.example.productcontext.infra.springboot.response;

import com.example.productcontext.domain.entities.Product;

public class ProductResponse {

	private int id;
	private String name;
	private double price;
	
	public ProductResponse() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductResponse(Product p) {
		this.id = p.getId();
		this.name = p.getName();
		this.price = p.getPrice();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
