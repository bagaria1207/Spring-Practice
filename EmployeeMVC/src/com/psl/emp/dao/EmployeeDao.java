package com.psl.emp.dao;

import java.util.HashMap;

import com.psl.emp.bean.Employee;

public interface EmployeeDao {
	public Employee getEmployeeById(int empId);
	public HashMap<Integer, Employee> getAllEmployee();
	public Employee addEmployee(Employee emp);
	public Employee removeEmployee(int empId);
}
