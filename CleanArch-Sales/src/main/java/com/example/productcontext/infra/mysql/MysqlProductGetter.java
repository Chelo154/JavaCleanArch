package com.example.productcontext.infra.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.example.productcontext.app.interfaces.IDBProductGetter;
import com.example.productcontext.domain.entities.Product;

public class MysqlProductGetter implements IDBProductGetter {

	public MysqlProductGetter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Product> getProducts() throws Exception {
		
		ArrayList<Product> products = new ArrayList<>();
		
		String query = "SELECT * FROM products";
		
		Connection connection = connect();
		
		PreparedStatement statement = connection.prepareStatement(query);
		
		ResultSet results = statement.executeQuery();
		
		while(results.next()) {
			products.add(new Product(
					results.getInt("id"), 
					results.getString("name"),
					results.getDouble("price")
					)
			);
		}		
		return products;
	}
	
	private Connection connect() throws SQLException {
		return DriverManager.getConnection(MysqlConfig.url,MysqlConfig.user,MysqlConfig.password);
	}

}
