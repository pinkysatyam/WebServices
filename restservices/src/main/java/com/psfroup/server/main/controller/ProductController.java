package com.psfroup.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.psfroup.server.main.model.Product;
import com.psfroup.server.main.services.ProductService;
import com.psfroup.server.main.services.exception.ProductNotFoundException;
@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	@GetMapping("/")
	public String home() {
		return "index.html";
	}
	
	@GetMapping("/get_product")
	public List<Product> getAll(){
	return productService.findAll();
	}
	@PostMapping("/add_prodeuct")
	public String addProduct(@RequestBody Product prod) {
		 return productService.addProduct(prod);
		
	}
	@GetMapping("/get_a_product/{id}")
	public Product getAProduct(@PathVariable int id) {
			return productService.getAProduct(id);
			
		}
		@DeleteMapping("/delete_a_product/{id}")
		public String deleteProduct(@PathVariable int id) {
			return productService.deleteProduct(id);
		
	}
		@GetMapping("/get_a_product1/{id}")
		public void getAProduct1(@PathVariable int id) {
			if(id==5) {
				throw new ProductNotFoundException("product not found");
			}
				
				
			}

}
