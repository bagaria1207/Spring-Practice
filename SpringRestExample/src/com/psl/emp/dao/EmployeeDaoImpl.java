package com.psl.emp.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.psl.emp.bean.Employee;

@Repository("dao")
public class EmployeeDaoImpl implements EmployeeDao{


	static HashMap<Integer,Employee>map;
	
	static
	{
		map = new HashMap<Integer,Employee>();
		map.put(101, new Employee(101,"Sima",30000));
		map.put(102, new Employee(102,"Ram",20000));
		map.put(103, new Employee(103,"Jaya",40000));
		
	}
	@Override
	public void deleteEmp(int id) {
		// TODO Auto-generated method stub
	
		map.remove(id);
	}

	@Override
	public HashMap<Integer,Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return map;
		
	}

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		map.put(e.getEmpId(), e);
	}

	@Override
	public Employee updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		map.replace(e.getEmpId(), e);
		return map.get(e.getEmpId());
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return map.get(id);
	}


}
