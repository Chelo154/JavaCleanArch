package com.example.clientcontext.domain.valueobjects;

import com.example.clientcontext.domain.exceptions.InsecurePasswordException;

public class Password {

	private String value;
	
	public Password(String value)throws InsecurePasswordException{
		if(isSecure(value)) this.value = value;
		else throw new InsecurePasswordException(value);
	}
	
	private boolean isSecure(String value) {
		return value.length() > 4;
	}
	
	
	public boolean validate(String password) {
		return value.equals(password);
	}
	
	private void changePassword(String value) throws Exception {
		if(!isSecure(value)) {
			throw new InsecurePasswordException(value);
		}
		else {
			if(validate(value)) {
				
			}
			else this.value = value;
		}
	}

	public String getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	
	

}
