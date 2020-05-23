package com.psl.pojo;

public class Person {
	String name;
	Address officeAddress;
	Address homeAddress;
	
	public Person(){
		this.name = "kiran";
		this.officeAddress = null;
		this.homeAddress = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	
}
