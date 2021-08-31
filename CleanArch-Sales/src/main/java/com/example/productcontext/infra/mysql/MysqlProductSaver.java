package com.example.productcontext.infra.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.productcontext.app.interfaces.IDBProductSaver;
import com.example.productcontext.domain.entities.Product;

public class MysqlProductSaver implements IDBProductSaver {	
	
	public MysqlProductSaver() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(Product p) throws Exception {
		
		String query = "INSERT INTO products values(?,?,?)";
		
		Connection connection = connect();
		
		PreparedStatement statement = connection.prepareStatement(query);
		
		statement.setInt(1,p.getId());
		
		statement.setString(2,p.getName());
		
		statement.setDouble(3,p.getPrice());
		
		statement.execute();	
		
	}
	
	private Connection connect() throws SQLException {
		return DriverManager.getConnection(MysqlConfig.url,MysqlConfig.user,MysqlConfig.password);
	}

}
