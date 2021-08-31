package com.example.productcontext.infra.springboot.request;

public class ProductData {

	private int id;
	
	private String name;
	
	private double price;	
	
	public ProductData() {
		// TODO Auto-generated constructor stub
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
	
	public boolean isValid() {
		
		boolean validId = id != 0;
		
		boolean validName = name != null;
		
		return validId && validName;
	}
	
	

}
