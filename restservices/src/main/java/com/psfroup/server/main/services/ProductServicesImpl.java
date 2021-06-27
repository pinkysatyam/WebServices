package com.psfroup.server.main.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.psfroup.server.main.model.Product;
import com.psfroup.server.main.services.exception.ProductNotFoundException;
@Service
public class ProductServicesImpl implements ProductService  {
private List<Product> product = new ArrayList<>();	
	@Override
	public List<Product> findAll() {
product.add(new Product(001,"tv"));
		return product;
	}

	@Override
	public Product getAProduct(int id) {
	Product pro =product.stream().filter(p->p.getId()==id).findAny().get();
	
	return pro;
}
    @Override
	public String addProduct(Product prod) {
		product.add(prod);
	return "product add succsefully";
		
	}

	@Override
	public String deleteProduct(int id) {
		Product pro = product.stream().filter(p->p.getId()==id).findAny().get();
		product.remove(pro);
		return "remove product successfully";
	}
	

}
