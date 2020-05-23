package com.psl.pojo;

public class Student {
	String name;
	String addr;
	int age;
	
	public Student(){
		this.name = "Shelke";
		this.addr = "Maharashtra";
		this.age = 50;
	}
	
//	public Student(String name, String addr, int age) {
//		System.out.println("HELP FROM CONSTRUCTOR");
//		this.name = name;
//		this.addr = addr;
//		this.age = age;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("HELP FROM SETTER");
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		System.out.println("HELP FROM SETTER");
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("HELP FROM SETTER");
		this.age = age;
	}
	
}
