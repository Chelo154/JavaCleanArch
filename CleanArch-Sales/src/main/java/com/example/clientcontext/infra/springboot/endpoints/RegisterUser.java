package com.example.clientcontext.infra.springboot.endpoints;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.clientcontext.app.controllers.UserRegisterController;
import com.example.clientcontext.infra.DBConfiguration;
import com.example.clientcontext.infra.springboot.request.UserData;

@RestController
public class RegisterUser {

	private UserRegisterController controller;
	public RegisterUser() {
		controller = new UserRegisterController(DBConfiguration.userRegister);
	}
	
	@PostMapping(value = "/user",consumes = "application/json",produces = "application/json")
	public void registerUser(@RequestBody UserData data)throws Exception{
		
		if(data.validate()) {
			controller.registerUser(
					data.getUsername(), 
					data.getEmail(), 
					data.getPassword()
			);
		} 
		else throw new Exception("Missing Parameters");
	}

}
