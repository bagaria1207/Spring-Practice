package com.psl.pojo;

import java.util.List;
import java.util.Set;

public class Person {
	String name;
//	List<Address> addressList;
//	Map<String, Address> addressmap;
	Set<Address> addressSet;
	
	public Person(){
		name = "Ruhi";
	}

//	public Map<String, Address> getAddressmap() {
//		return addressmap;
//	}
//
//	public void setAddressmap(Map<String, Address> addressmap) {
//		this.addressmap = addressmap;
//	}

	public Set<Address> getAddressSet() {
		return addressSet;
	}

	public void setAddressSet(Set<Address> addressSet) {
		this.addressSet = addressSet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public List<Address> getAddressList() {
//		return addressList;
//	}
//
//	public void setAddressList(List<Address> addressList) {
//		this.addressList = addressList;
//	}

}
