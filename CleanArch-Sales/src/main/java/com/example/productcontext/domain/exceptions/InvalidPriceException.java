package com.example.productcontext.domain.exceptions;

public class InvalidPriceException extends Exception{

	public InvalidPriceException() {
		super("You can't create a price with negative values");
	}

}
