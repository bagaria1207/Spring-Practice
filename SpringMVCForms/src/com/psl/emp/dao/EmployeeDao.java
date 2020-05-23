package com.psl.emp.dao;

import java.util.List;

import com.psl.emp.bean.Employee;

public interface EmployeeDao {
	public Employee addEmployee(Employee emp);
	public List<Employee> getAllEmployees();
}
