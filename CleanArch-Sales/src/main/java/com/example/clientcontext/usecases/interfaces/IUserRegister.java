package com.example.clientcontext.usecases.interfaces;
import com.example.clientcontext.domain.entities.User;

public interface IUserRegister {
	
	public void register(User user) throws Exception;
}
