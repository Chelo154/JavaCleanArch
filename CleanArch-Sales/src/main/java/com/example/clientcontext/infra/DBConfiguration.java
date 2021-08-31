package com.example.clientcontext.infra;

import com.example.clientcontext.app.interfaces.IDBUserRegister;
import com.example.clientcontext.infra.mongodb.MongoDBUserRegister;

public class DBConfiguration {

	public static IDBUserRegister userRegister = new MongoDBUserRegister();

}
