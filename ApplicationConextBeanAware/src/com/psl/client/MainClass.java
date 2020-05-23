package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Employee obj = context.getBean("emp",Employee.class);
		System.out.println(obj.getEmpId());
		
	}

}
