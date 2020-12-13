package com.linh.pttkht2.model;

public class Book {

	private int BookID;
	private String name;
	private int numPage;
	private Publisher publisher;
	private Author author;
	private Item item;
	private double price;

	public Book() {
	}

	public Book(int bookID, String name, int numPage, Publisher publisher, Author author, Item item, double price) {
		BookID = bookID;
		this.name = name;
		this.numPage = numPage;
		this.publisher = publisher;
		this.author = author;
		this.item=item;
		this.price=price;
	}

	public int getBookID() {
		return BookID;
	}

	public void setBookID(int bookID) {
		BookID = bookID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumPage() {
		return numPage;
	}

	public void setNumPage(int numPage) {
		this.numPage = numPage;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}