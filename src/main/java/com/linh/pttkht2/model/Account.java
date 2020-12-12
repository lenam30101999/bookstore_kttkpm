package com.linh.pttkht2.model;

public class Account {
	
	private int id;
	private String username;
	private String password;
	private int customerId;

	public Account(int id, String username, String password, int customerId) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.customerId = customerId;
	}

	public Account() {
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
}