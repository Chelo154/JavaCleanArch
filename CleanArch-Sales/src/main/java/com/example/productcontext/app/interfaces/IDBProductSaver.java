package com.example.productcontext.app.interfaces;

import com.example.productcontext.domain.entities.Product;

public interface IDBProductSaver {

	public void save(Product p) throws Exception;
}
