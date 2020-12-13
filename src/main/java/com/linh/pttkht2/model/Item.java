package com.linh.pttkht2.model;

import java.util.Objects;

public class Item {

	private int itemID;
	private String name;
	private int quantity;
	private Book book;

	public Item() {
	}

	public Item(int itemID, String name, int quantity, Book book) {
		this.itemID = itemID;
		this.name = name;
		this.quantity = quantity;
		this.book = book;
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

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Item item = (Item) o;
		return itemID == item.itemID &&
				quantity == item.quantity &&
				Objects.equals(name, item.name) &&
				Objects.equals(book, item.book);
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemID, name, quantity, book);
	}

	@Override
	public String toString() {
		return "Item{" +
				"itemID=" + itemID +
				", name='" + name + '\'' +
				", quantity=" + quantity +
				", book=" + book +
				'}';
	}
}