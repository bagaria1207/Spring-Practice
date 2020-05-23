package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.pojo.Address;
import com.psl.pojo.Person;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * Resource is a built in interface
		 * ClassPathResource searches xml file in src 
		 * Else we will use FilePathResource
		 */
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("config.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Person obj1 = (Person)context.getBean("person");
		System.out.println("Name = "+obj1.getName()+
				"\nAddress City = "+obj1.getAddr().getCity()+
				"\nAddress pincode = "+obj1.getAddr().getPincode()+
				"\nAge = "+obj1.getAge());
//		Address obj2 = (Address)context.getBean("addr");
//		System.out.println("city = "+obj2.getCity()+"\npincode "+obj2.getPincode());
//		((ConfigurableApplicationContext)context).close();
	}	
}
