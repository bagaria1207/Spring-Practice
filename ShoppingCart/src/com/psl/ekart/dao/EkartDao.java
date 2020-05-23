package com.psl.ekart.dao;

import java.util.Map;

import com.psl.ekart.bean.Customer;
import com.psl.ekart.bean.Product;

public interface EkartDao {
	public Customer loginCustomer(Customer cust);
	public Map<Integer, Product> getAllProduct();
}
