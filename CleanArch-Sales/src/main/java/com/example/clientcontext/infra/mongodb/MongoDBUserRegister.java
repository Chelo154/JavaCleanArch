package com.example.clientcontext.infra.mongodb;

import java.net.UnknownHostException;

import com.example.clientcontext.app.interfaces.IDBUserRegister;
import com.example.clientcontext.domain.entities.User;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class MongoDBUserRegister implements IDBUserRegister {

	public MongoDBUserRegister() {
		
	}

	@Override
	public void register(User user) throws Exception {
		
		MongoClient client = connect();
		
		DB database = client.getDB(MongoDBConfig.database);
		
		DBCollection collection = database.getCollection(MongoDBConfig.collection);
		
		DBObject object = new BasicDBObject("_id",user.getUserName())
				.append("name",user.getUserName())
				.append("password",user.getPassword());
		
		collection.insert(object);
		collection.save(object);
		
	}
	
	
	private MongoClient connect() throws UnknownHostException {
		return new MongoClient();
	}

}
