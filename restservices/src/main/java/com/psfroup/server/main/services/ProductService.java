package com.psfroup.server.main.services;

import java.util.List;

import com.psfroup.server.main.model.Product;

public interface ProductService {

	public List<Product> findAll();
	public Product getAProduct(int id);
	public String addProduct(Product product);
	public String deleteProduct(int id);
}
