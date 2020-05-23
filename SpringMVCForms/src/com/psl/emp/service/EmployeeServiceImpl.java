package com.psl.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.emp.bean.Employee;
import com.psl.emp.dao.EmployeeDao;

@Service("service")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.addEmployee(emp);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

}
