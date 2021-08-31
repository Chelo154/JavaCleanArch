package com.example.clientcontext.domain.exceptions;

public class InvalidMailException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidMailException(String value) {
		super(value + " is not a valid email");
	}

}
