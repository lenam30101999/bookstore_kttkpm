package com.linh.pttkht2.model;

import java.util.List;

public class Customer {

	private int custID;
	private String phoneNum;
	private FullName fullName;
	private Address address;
	private List<Order> orders;

	public Customer(int custID, String phoneNum, FullName fullName, Address address, List<Order> orders) {
		this.custID = custID;
		this.phoneNum = phoneNum;
		this.fullName = fullName;
		this.address = address;
		this.orders = orders;
	}

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}