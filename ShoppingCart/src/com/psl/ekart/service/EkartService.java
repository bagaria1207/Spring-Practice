package com.psl.ekart.service;

import java.util.Map;

import com.psl.ekart.bean.Customer;
import com.psl.ekart.bean.Product;

public interface EkartService {
	public Customer loginCustomer(Customer cust);
	public Map<Integer,Product> getAllProduct();
}
