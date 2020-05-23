package com.psl.bean;

public class Address {

	private String city;
	private String pincode;
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
