package com.psl.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		IBank ref = (IBank) context.getBean("bank");
		System.out.println(ref.getBalance(101));
		ref.transfer(101, 102, 4000);
	}
}
