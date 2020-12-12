package com.linh.pttkht2.model;

public class Shipment {

	private int shipID;
	private double price;
	private Order order;

	public Shipment(int shipID, double price, Order order) {
		this.shipID = shipID;
		this.price = price;
		this.order = order;
	}

	public int getShipID() {
		return shipID;
	}

	public void setShipID(int shipID) {
		this.shipID = shipID;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}