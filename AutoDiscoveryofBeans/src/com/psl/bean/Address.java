package com.psl.bean;

import org.springframework.stereotype.Component;

@Component(value="address")
public class Address {

	private String city;
	private String pincode;
	
	public Address()
	{
		
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Address(String city, String pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}
	
	
}
