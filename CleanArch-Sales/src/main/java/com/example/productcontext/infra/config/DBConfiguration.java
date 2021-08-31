package com.example.productcontext.infra.config;


import com.example.productcontext.app.interfaces.IDBProductGetter;
import com.example.productcontext.app.interfaces.IDBProductSaver;
import com.example.productcontext.infra.mysql.MysqlProductGetter;
import com.example.productcontext.infra.mysql.MysqlProductSaver;


public class DBConfiguration {	
	
	public static final IDBProductSaver PRODUCT_CREATOR_REPO = new MysqlProductSaver(); 
	public static final IDBProductGetter PRODUCT_GETTER_REPO= new MysqlProductGetter(); 

}
