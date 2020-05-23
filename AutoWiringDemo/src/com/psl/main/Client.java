package com.psl.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.psl.pojo.Employee;
import com.psl.pojo.Person;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Person person = (Person)context.getBean("person");
		System.out.println("Name = "+person.getName());
		System.out.println("City = "+person.getAddress().getCity());
		System.out.println(("PinCode = "+person.getAddress().getPincode()));
		
		
//		Employee employee = (Employee)context.getBean("employee");
//		System.out.println("Name = "+employee.getName());
//		System.out.println("City = "+employee.getAddress().getCity());
//		System.out.println("Pincode = "+employee.getAddress().getPincode());
//		((ConfigurableApplicationContext)context).close();
	}
}
