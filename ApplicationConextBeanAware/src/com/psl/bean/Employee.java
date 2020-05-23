package com.psl.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Employee implements ApplicationContextAware,BeanNameAware{

	private int empId;
	private String empName;
	ApplicationContext context;
	
	public int getEmpId() {
		System.out.println("call to get id");
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		System.out.println("call to get name");
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
		System.out.println("constructor is invoked........");
	}
	@Override
	public void setApplicationContext(ApplicationContext arg0)throws BeansException {
		// TODO Auto-generated method stub
		this.context = arg0;
		System.out.println("setApplicationContext invoked..........");
		
	}
	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
	System.out.println("bean name is = "+beanName);	
	}
	
	
}
