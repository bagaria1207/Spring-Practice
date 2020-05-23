package com.psl.emp.service;

import java.util.List;

import com.psl.emp.bean.Employee;

public interface EmployeeService {
	public Employee addEmployee(Employee emp);
	public List<Employee> getAllEmployees();
}
