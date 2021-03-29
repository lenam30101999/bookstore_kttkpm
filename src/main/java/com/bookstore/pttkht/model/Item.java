package com.bookstore.pttkht.model;

import java.util.Objects;

public class Item {

	private int itemID;
	private String name;
	private int quantity;
	private Cart cart;

	public Item() {
	}

	public Item(int itemID, String name, int quantity, Cart cart) {
		this.itemID = itemID;
		this.name = name;
		this.quantity = quantity;
		this.cart = cart;
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

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Item item = (Item) o;
		return itemID == item.itemID &&
				quantity == item.quantity &&
				Objects.equals(name, item.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemID, name, quantity);
	}

	@Override
	public String toString() {
		return "Item{" +
				"itemID=" + itemID +
				", name='" + name + '\'' +
				", quantity=" + quantity +
				'}';
	}
}