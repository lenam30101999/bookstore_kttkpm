package com.linh.pttkht2.model;

public class Item {

	private int itemID;
	private String name;
	private int quantity;
	private double price;
	private Book book;

	public Item() {
	}

	public Item(int itemID, String name, int quantity, double price, Book book) {
		this.itemID = itemID;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
}