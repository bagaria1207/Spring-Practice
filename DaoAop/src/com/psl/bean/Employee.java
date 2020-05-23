package com.psl.bean;

public class Employee {
	int empId;
	String empName;
	int empSal;
	String designation;
	
	public Employee(){
		System.out.println("Vijay");
	}

	
	public Employee(int empId, String empName, int empSal, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.designation = designation;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSal=" + empSal + ", designation=" + designation + "]";
	}
	
}
