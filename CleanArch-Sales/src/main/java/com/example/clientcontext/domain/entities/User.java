package com.example.clientcontext.domain.entities;

import com.example.clientcontext.domain.valueobjects.Email;
import com.example.clientcontext.domain.valueobjects.Password;

public class User {
	
	private String userName;
	private Email email;
	private Password password;
	
	public User(String userName, String email, String password)throws Exception{
		this.userName = userName;
		this.email = new Email(email);
		this.password = new Password(password);
	}
	
	
	public boolean validUser(String username, String password) {
		return this.userName.equals(username) && this.password.validate(password);
	}


	public String getUserName() {
		return userName;
	}


	public String getEmail() {
		return email.getValue();
	}
	
	public String getPassword() {
		return password.getValue();
	}

}
