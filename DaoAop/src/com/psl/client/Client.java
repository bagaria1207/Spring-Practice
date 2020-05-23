package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.Employee;
import com.psl.dao.EmployeeDaoI;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		EmployeeDaoI dao = (EmployeeDaoI)context.getBean("dao");
//		List<Employee> a = dao.fetchEmployee();
//		for(Employee e : a){
//			System.out.println(e);
//		}
		Employee e = new Employee();
		e.setEmpId(106);
		e.setEmpName("Pulkit");
		e.setEmpSal(98);
		e.setDesignation("Staff");
//		Employee y = (Employee)context.getBean("emp5");
		if(dao.insertEmployee(e)){
			System.out.println("Inserted Fourth Employee");
		}
//		List<Employee> a1 = dao.fetchEmployee();
//		for(Employee e : a1){
//			System.out.println(e);
//		}
//		((ConfigurableApplicationContext)context).close();
	}
}
