package com.psl.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.psl.bean.Product;

@Repository("dao")
public class ProductDaoImpl implements ProductDao{

	static HashMap<String, Product> map;
	static {
		map = new HashMap<String, Product>();
		map.put("1", new Product("1", "AndroidPhone", 35000));
		map.put("2", new Product("2", "Laptop", 75000));
		map.put("3", new Product("3", "Iphone 11 Pro", 85000));
		map.put("4", new Product("4", "MacBook", 95000));
		map.put("5", new Product("5", "IMac", 135000));
		map.put("6", new Product("6", "Tab", 65000));
	}
	
	@Override
	public Product getProductById(String prodId) {
		return map.get(prodId);
	}

	@Override
	public HashMap<String, Product> getAllProducts() {
		return map;
	}

	@Override
	public Product deleteProductById(String prodId) {
		// TODO Auto-generated method stub
		return map.remove(prodId);
	}
	
	@Override
	public Product addProduct(Product product) {
		return map.put(product.getProdId(), product);
	}

	@Override
	public Product updateProduct(Product product) {
		return map.put(product.getProdId(), product);
	}
	
}
