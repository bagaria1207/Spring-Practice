package com.psl.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.psl.bean.Product;
import com.psl.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;
	
	@RequestMapping(value="/product/{id}")
	public @ResponseBody Product getProductById(@PathVariable("id")String id){
		return service.getProductById(id);
	}
	
	@RequestMapping("/product/getAll")
	public @ResponseBody HashMap<String, Product> getAllProduct(){
		return service.getAllProducts();
	}
	
	@RequestMapping(value="/product/delProd/{id}")
	public @ResponseBody Product deleteProd(@PathVariable("id")String id){
		return service.deleteProductById(id);
	}
	
	@RequestMapping(value="/product", method=RequestMethod.POST, headers="Accept=application/json")
	public Product addProd(@RequestBody Product product){
		return service.addProduct(product);
	}
	
	@RequestMapping(value="/product", method=RequestMethod.PUT, headers="Accept=application/json")
	public @ResponseBody Product deleteProd(@RequestBody Product product){
		return service.updateProduct(product);
	}
	
	
}
