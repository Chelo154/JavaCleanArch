package com.example.productcontext.usecases.interfaces;
import com.example.productcontext.domain.entities.Product;

public interface IProductSaver {
	
	public void save(Product p) throws Exception;

}