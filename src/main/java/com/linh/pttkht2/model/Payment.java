package com.linh.pttkht2.model;

public class Payment {

	private int payID;
	private double price;
	private Shipment shipment;

	public Payment(int payID, double price, Shipment shipment) {
		this.payID = payID;
		this.price = price;
		this.shipment = shipment;
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

	public Shipment getShipment() {
		return shipment;
	}

	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}
}