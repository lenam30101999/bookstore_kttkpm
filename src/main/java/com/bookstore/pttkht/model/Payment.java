package com.bookstore.pttkht.model;

public class Payment {

	private int payID;
	private double price;
	private Cart cart;

	public Payment() {
	}

	public Payment(int payID, double price, Cart cart) {
		this.payID = payID;
		this.price = price;
		this.cart = cart;
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

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
}