package com.psl.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.pojo.Student;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student obj = (Student)context.getBean("student");
		System.out.println("Name = "+obj.getName());
		System.out.println("Address = "+obj.getAddr());
		System.out.println("Age = "+obj.getAge());
	}
}
