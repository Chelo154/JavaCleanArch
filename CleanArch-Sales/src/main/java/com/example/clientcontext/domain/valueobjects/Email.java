package com.example.clientcontext.domain.valueobjects;

import java.util.regex.Pattern;

import com.example.clientcontext.domain.exceptions.InvalidMailException;

public class Email {
	
	private String value;
	
	public Email(String value) throws InvalidMailException {
		if(isValid(value)) this.value = value;
		else throw new InvalidMailException(value);
	}
	
	private boolean isValid(String value) {
		
		return Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE)
		.matcher(value).find();	

	}
	
	private String getDomain() {
		return value.split("@")[1];
	}
	
	private String getAddress() {
		return value.split("")[0];
	}

	public String getValue() {		
		return value;
	}

}
