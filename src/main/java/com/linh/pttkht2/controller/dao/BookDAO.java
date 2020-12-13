package com.linh.pttkht2.controller.dao;

import com.linh.pttkht2.model.Book;

import java.util.List;

public interface BookDAO {

	void addBook();

	Book getBook(int bookID);

	List<Book> getAllBook();

	void update();

	void delete();

}