package com.bookstore.pttkht.model;

import java.util.List;

public class Item {

	private int itemID;
	private String name;
	private int quantity;
	private List<CartItem> cartItems;

	public Item() {
	}

	public Item(int itemID, String name, int quantity, List<CartItem> cartItems) {
		this.itemID = itemID;
		this.name = name;
		this.quantity = quantity;
		this.cartItems = cartItems;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

}