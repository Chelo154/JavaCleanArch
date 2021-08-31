package com.example.clientcontext.usecases;

import com.example.clientcontext.domain.entities.User;
import com.example.clientcontext.usecases.interfaces.IUserRegister;

public class RegisterUser {

	private IUserRegister userRegister;
	
	public RegisterUser(IUserRegister userRegister) {
		this.userRegister = userRegister;
	}
	
	public void register(String userName, String email, String password)throws Exception{
		
		User newUser = new User(userName, email, password);
		
		userRegister.register(newUser);
		
	}

}
