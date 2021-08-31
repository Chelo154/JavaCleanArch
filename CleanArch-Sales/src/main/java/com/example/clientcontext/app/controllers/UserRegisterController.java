package com.example.clientcontext.app.controllers;

import com.example.clientcontext.app.interfaces.IDBUserRegister;
import com.example.clientcontext.app.services.UserRegisterService;
import com.example.clientcontext.usecases.RegisterUser;

public class UserRegisterController {

	private RegisterUser userRegister;
	
	public UserRegisterController(IDBUserRegister register) {
		this.userRegister = new RegisterUser(new UserRegisterService(register));
	}
	
	
	public void registerUser(String userName,String email, String password) throws Exception{
		
		userRegister.register(userName,email,password);
	}

}
