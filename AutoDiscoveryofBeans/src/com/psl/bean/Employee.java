package com.psl.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="emp")
public class Employee {

	private int empId;
	
	@Autowired
	private Address address;
	public Employee()
	{
		
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(int empId) {
		super();
		this.empId = empId;
	}
	
	
}
