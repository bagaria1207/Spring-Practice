package com.psl.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.dao.EmployeeDao;
import com.psl.pojo.Employee;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		EmployeeDao dao = (EmployeeDao)context.getBean("dao");
//		if(dao.insert((Employee)context.getBean("emp1"))){
//			if(dao.insert((Employee)context.getBean("emp2"))){
//				if(dao.insert((Employee)context.getBean("emp3"))){
//					System.out.println("Inserted Three Employees");
//				}
//			}
//		}
		List<Employee> a = dao.getAllUsingRowMapper();
//		List<Employee> a = dao.getAllEmployee();
		for(Employee e : a){
			System.out.println(e);
		}
//		Employee f = new Employee();
//		f.setEmpSal(95000);
//		f.setEmpId(101);
//		System.out.println(dao.update(f));
		Employee z = new Employee();
		z.setEmpId(103);
		System.out.println(dao.delete(z));
		List<Employee> a1 = dao.getAllUsingRowMapper();
//		List<Employee> a = dao.getAllEmployee();
		for(Employee e : a1){
			System.out.println(e);
		}
		((ConfigurableApplicationContext)context).close();
	}
}
