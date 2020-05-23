package com.psl.ekart.bean;

public class Customer {
	private int custId;
	private String userName;
	private String userPass;
	
	public Customer(){}

	public Customer(int custId, String userName, String userPass) {
		super();
		this.custId = custId;
		this.userName = userName;
		this.userPass = userPass;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", userName=" + userName
				+ ", userPass=" + userPass + "]";
	}
	
}
