package com.linh.pttkht2.model;

import java.util.List;

public class Cart {
	private int cartID;
	private int totalQuantity;
	private Payment payment;
	private Shipment shipment;
	private List<Item> items;

	public Cart() {
	}

	public Cart(int cartID, int totalQuantity, Payment payment, Shipment shipment, List<Item> items) {
		this.cartID = cartID;
		this.totalQuantity = totalQuantity;
		this.payment = payment;
		this.shipment = shipment;
		this.items = items;
	}

	public int getCartID() {
		return cartID;
	}

	public void setCartID(int cartID) {
		this.cartID = cartID;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
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

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Cart{" +
				"cartID=" + cartID +
				", totalQuantity=" + totalQuantity +
				", payment=" + payment +
				", shipment=" + shipment +
				", items=" + items +
				'}';
	}
}