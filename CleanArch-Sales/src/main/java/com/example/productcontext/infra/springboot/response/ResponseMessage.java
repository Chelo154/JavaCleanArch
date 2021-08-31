package com.example.productcontext.infra.springboot.response;

public class ResponseMessage {
	
	private boolean ok;
	
	private String message;

	public ResponseMessage() {
		// TODO Auto-generated constructor stub
	}
	
	public ResponseMessage(String message) {
		this.message = message;
		ok = true;
	}

	public boolean isOk() {
		return ok;
	}

	public void setOk(boolean ok) {
		this.ok = ok;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
