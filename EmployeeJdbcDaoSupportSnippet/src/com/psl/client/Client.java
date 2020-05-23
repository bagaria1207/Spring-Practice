package com.psl.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.Employee;
import com.psl.dao.EmployeeDao;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		EmployeeDao dao = (EmployeeDao)context.getBean("dao");
		List<Employee> a = dao.fetchEmployee();
		for(Employee e : a){
			System.out.println(e);
		}
		if(dao.insert((Employee)context.getBean("emp3"))){
			System.out.println("Inserted Third Employees");
		}
		List<Employee> a1 = dao.fetchEmployee();
		for(Employee e : a1){
			System.out.println(e);
		}
		((ConfigurableApplicationContext)context).close();
	}
}
