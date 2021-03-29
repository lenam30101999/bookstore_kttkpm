package com.bookstore.pttkht.model;

public class Payment {

	private int payID;
	private double price;

	public Payment(int payID, double price) {
		this.payID = payID;
		this.price = price;
	}

	public int getPayID() {
		return payID;
	}

	public void setPayID(int payID) {
		this.payID = payID;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}