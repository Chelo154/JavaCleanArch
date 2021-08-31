package com.example.productcontext.domain.valueobjects;

import com.example.productcontext.domain.exceptions.InvalidPriceException;

public class Price {
	
	public double value;

	public Price(double value) throws InvalidPriceException {
		
		if (isValidPrice(value)) this.value = value;
		else throw new InvalidPriceException();
	}
	
	public double getValue() {
		return value;
	}
	
	public void increasePriceByPercentaje(double percentaje) {
		double amount = (value * percentaje)/100;
		value += amount;
	}
	
	public void changePrice(double value) throws InvalidPriceException {
		if (isValidPrice(value)) this.value = value;
		else throw new InvalidPriceException();
	}
	
	public double amountByQuantity(int quantity) {
		return value * quantity;
	}
	
	private boolean isValidPrice(double value) {
		return value > 0;
	}

}
