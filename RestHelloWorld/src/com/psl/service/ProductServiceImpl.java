package com.psl.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.bean.Product;
import com.psl.dao.ProductDao;

@Service("service")
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDao dao;
	
	@Override
	public Product getProductById(String prodId) {
		return dao.getProductById(prodId);
	}

	@Override
	public HashMap<String, Product> getAllProducts() {
		return dao.getAllProducts();
	}

	@Override
	public Product deleteProductById(String prodId) {
		return dao.deleteProductById(prodId);
	}

	@Override
	public Product addProduct(Product product) {
		return dao.addProduct(product);
	}

	@Override
	public Product updateProduct(Product product) {
		return dao.updateProduct(product);
	}

}
