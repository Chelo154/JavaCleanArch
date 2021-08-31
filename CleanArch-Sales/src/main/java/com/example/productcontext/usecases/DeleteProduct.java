package com.example.productcontext.usecases;

import com.example.productcontext.usecases.interfaces.IProductDeleter;

public class DeleteProduct {

	IProductDeleter deleter;
	
	public DeleteProduct(IProductDeleter deleter) {
		this.deleter = deleter;
	}
	
	public void delete(int id) throws Exception {
		deleter.deleteProduct(id);
	}

}
