package com.psl.pojo;

public class Person {
	String name;
	Address addr;
	int age;
	
//	public Person(){             
//		System.out.println("HELP FROM DEFAULT");
//		name = "Shazia";
//	}
	
	public Person(String name, Address addr, int age){
		System.out.println("HELP FROM PARAMETERISED");
		this.addr = addr;
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
