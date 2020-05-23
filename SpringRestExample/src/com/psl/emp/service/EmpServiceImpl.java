package com.psl.emp.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.psl.emp.bean.Employee;
import com.psl.emp.dao.EmployeeDao;

@Transactional
@Service("service")
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmployeeDao dao;
	
	public EmployeeDao getDao() {
		return dao;
	}

	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

	@Override
	public void deleteEmp(int id) {
		// TODO Auto-generated method stub
		dao.deleteEmp(id);
	}

	@Override
	public HashMap<Integer,Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllEmployee();
	}

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		dao.addEmployee(e);
	}

	@Override
	public Employee updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(e);
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return dao.getEmployeeById(id);
	}
	
}
