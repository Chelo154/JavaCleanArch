package com.example.clientcontext.app.services;

import com.example.clientcontext.app.interfaces.IDBUserRegister;
import com.example.clientcontext.domain.entities.User;
import com.example.clientcontext.usecases.interfaces.IUserRegister;

public class UserRegisterService implements IUserRegister{

	private IDBUserRegister repository;
	
	public UserRegisterService(IDBUserRegister repository) {
		this.repository = repository;
	}

	@Override
	public void register(User user) throws Exception {
		repository.register(user);
		
	}

}
