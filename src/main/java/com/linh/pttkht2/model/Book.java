package com.linh.pttkht2.model;

public class Book {

	private int BookID;
	private String name;
	private int numPage;
	private Publisher publisher;
	private Author author;
	private Categories categories;

	public Book(int bookID, String name, int numPage, Publisher publisher, Author author, Categories categories) {
		BookID = bookID;
		this.name = name;
		this.numPage = numPage;
		this.publisher = publisher;
		this.author = author;
		this.categories = categories;
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

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}
}