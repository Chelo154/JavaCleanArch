package com.example.productcontext.infra.springboot.response;

public class ErrorMessage {

	private String errorName;
	private String message;
	
	public ErrorMessage() {
		
	}
	
	public ErrorMessage(Exception e) {
		this.errorName = e.getClass().getSimpleName();
		this.message = e.getMessage();
	}

	public String getErrorName() {
		return errorName;
	}

	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
