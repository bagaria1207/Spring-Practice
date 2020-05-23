package com.psl.ekart.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.ekart.bean.Customer;
import com.psl.ekart.bean.Product;
import com.psl.ekart.dao.EkartDao;

@Service("service")
public class EkartServiceImpl implements EkartService{

	@Autowired
	EkartDao dao;
	
	@Override
	public Customer loginCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return dao.loginCustomer(cust);
	}

	@Override
	public Map<Integer, Product> getAllProduct() {
		// TODO Auto-generated method stub
		return dao.getAllProduct();
	}

}
