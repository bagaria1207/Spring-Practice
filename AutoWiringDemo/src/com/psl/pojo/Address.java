package com.psl.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("address")
public class Address {
	String city;
	String pincode;
	
	public Address(){
		this.city = "Ranchi";
		this.pincode = "815456";
	}
	
	public Address(String city, String pincode){
		this.city = city;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
//	@Autowired
//	public void setCity(@Value("Houston")String city) {
//		this.city = city;
//	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
}
