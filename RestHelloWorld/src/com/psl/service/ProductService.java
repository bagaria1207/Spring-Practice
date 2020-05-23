package com.psl.service;

import java.util.HashMap;

import com.psl.bean.Product;

public interface ProductService {
	
	public Product getProductById(String prodId);
	public HashMap<String, Product> getAllProducts();
	public Product deleteProductById(String prodId);
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	
}
