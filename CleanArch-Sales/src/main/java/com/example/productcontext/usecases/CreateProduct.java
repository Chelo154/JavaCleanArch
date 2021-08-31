package com.example.productcontext.usecases;
import com.example.productcontext.domain.entities.Product;
import com.example.productcontext.domain.exceptions.InvalidPriceException;
import com.example.productcontext.usecases.interfaces.IProductSaver;

public class CreateProduct {

	private IProductSaver saver;
	
	
	public CreateProduct(IProductSaver saver) {
		this.saver = saver;
	}
	
	public void create(int id, String name, double price) throws Exception {
		
		Product newProduct = new Product(id, name, price);
		
		saver.save(newProduct);
		
	}

}
