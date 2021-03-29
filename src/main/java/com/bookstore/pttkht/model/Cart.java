package com.bookstore.pttkht.model;

import java.util.List;

public class Cart {
	private int cartID;
	private int totalQuantity;
	private List<Item> items;

	public Cart() {
	}

	public Cart(int cartID, int totalQuantity, List<Item> items) {
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
}