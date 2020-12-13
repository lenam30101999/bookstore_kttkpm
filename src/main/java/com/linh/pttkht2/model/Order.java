package com.linh.pttkht2.model;

import java.util.Date;

public class Order {

	private int orderID;
	private Date date;
	private double price;
	private Cart cart;
	private Customer customer;
	private Payment payment;
	private Shipment shipment;

	public Order(int orderID, Date date, double price, Cart cart, Customer customer, Payment payment, Shipment shipment) {
		this.orderID = orderID;
		this.date = date;
		this.price = price;
		this.cart = cart;
		this.customer = customer;
		this.payment = payment;
		this.shipment = shipment;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Shipment getShipment() {
		return shipment;
	}

	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}
}