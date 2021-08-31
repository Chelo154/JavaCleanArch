package com.example.clientcontext.domain.exceptions;

public class SamePasswordException extends Exception {
	
	
	private static final long serialVersionUID = 1L;

	public SamePasswordException() {
		super("New password must be different from the old one");
	}

}
