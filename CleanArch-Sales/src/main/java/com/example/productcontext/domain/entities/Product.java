package com.example.productcontext.domain.entities;

import com.example.productcontext.domain.exceptions.InvalidPriceException;
import com.example.productcontext.domain.valueobjects.Price;

public class Product {
	
	private int id;
	private String name;
	private Price price;

	public Product(int id, String name, double price) throws InvalidPriceException {
		this.id  = id;
		this.name = name;
		this.price = new Price(price);
	}
	
	
	public double amountByQuantity(int quantity) {
		return price.amountByQuantity(quantity);
	}
	
	public void changePrice(double value) throws InvalidPriceException {
		price.changePrice(value);
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price.getValue();
	}
	
	public void increasePriceByPercentaje(double percentaje) {
		price.increasePriceByPercentaje(percentaje);
	}

}
