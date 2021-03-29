package com.bookstore.pttkht.model;

import java.util.List;

public class Item {

	private int itemID;
	private String name;
	private int quantity;
	private long price;
	private List<Cart> carts;

	public Item() {
	}

	public Item(int itemID, String name, int quantity, long price, List<Cart> carts) {
		this.itemID = itemID;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.carts = carts;
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

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}
}