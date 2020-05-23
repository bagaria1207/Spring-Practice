package com.psl.pojo;

public class Address {
	String city;
	String pincode;
	public Address(){
		city = "Pune";
		pincode = "411040";
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
	
}
