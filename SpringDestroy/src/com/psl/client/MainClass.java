package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.pojo.HelloWorld;
import com.psl.pojo.Person;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		HelloWorld bean = (HelloWorld)context.getBean("helloworld");
		System.out.println(bean.sayHello());
		Person person = (Person)context.getBean("person");
//		System.out.println(person.hashCode());
		person.setName("Diya");
		Person person1 = (Person)context.getBean("person");
//		System.out.println(person1.hashCode());
		System.out.println(person1.getName());
//		System.out.println("Name -> "+person.getName());
//		System.out.println(("City -> "+person.getHomeAddress().getCity()));
//		System.out.println("Pincode -> "+person.getHomeAddress().getPincode());
//		System.out.println(("Office City -> "+person.getOfficeAddress().getCity()));
//		System.out.println("Office Pincode -> "+person.getOfficeAddress().getPincode());
		
		((ConfigurableApplicationContext)context).close();
	}
}
