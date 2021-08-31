package com.example.clientcontext.domain.exceptions;

public class InsecurePasswordException extends Exception {

	public InsecurePasswordException(String value) {
		super("The introduced password is insecure");
	}

}
