package com.example.clientcontext.infra.springboot.request;

public class UserData {

	private String username;
	private String email;
	private String password;
	
	public UserData() {
		// TODO Auto-generated constructor stub
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public boolean validate() {
		return username != null &&
				email != null &&
				password != null ;
	}
	

}
