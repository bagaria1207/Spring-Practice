package com.psl.dao;

import java.util.List;

import com.psl.bean.Employee;

public interface EmployeeDaoI {
	public List<Employee> fetchEmployee();
	public boolean insertEmployee(final Employee bean);
	public int update(Employee bean);
	public int delete(Employee bean);

}
