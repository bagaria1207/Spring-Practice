package com.psl.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("person")
public class Person {
	String name;
	
	@Autowired
	@Qualifier("ad")
	Address address; 
	public Person(){
		this.name = "Shyam";
	}
	public Person(String name, Address addr){
		this.address = addr;
		this.name = name;
	}
	public Person(Address addr){
		this.address = addr;
	}
	public String getName() {
		return name;
	}
//	@Autowired
//	public void setName(@Value("Preeti")String name) {
//		this.name = name;
//	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}	
	
	
}
