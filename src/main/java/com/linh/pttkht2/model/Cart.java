package com.linh.pttkht2.model;

import java.util.List;

public class Cart {
	private int cartID;
	private int totalQuantity;
	private List<Item> items;

	public Cart() {
	}

	public Cart(int cartID, int totalQuantity, Payment payment, Shipment shipment, List<Item> items) {
		this.cartID = cartID;
		this.totalQuantity = totalQuantity;
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
				", items=" + items +
				'}';
	}
}