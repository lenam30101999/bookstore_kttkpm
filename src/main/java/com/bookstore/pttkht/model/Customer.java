package com.bookstore.pttkht.model;

import java.util.List;

public class Customer {

	private int custID;
	private String phoneNum;
	private String firstName;
	private String middleName;
	private String lastName;
	private String city;
	private String street;
	private String username;
	private String password;
	private String age;
	private String country;
	private List<Order> orders;

	public Customer() {
	}

	public Customer(int custID, String phoneNum, String firstName, String middleName, String lastName, String city,
					String street, String username, String password, String age, String country, List<Order> orders) {
		this.custID = custID;
		this.phoneNum = phoneNum;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.city = city;
		this.street = street;
		this.username = username;
		this.password = password;
		this.age = age;
		this.country = country;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}