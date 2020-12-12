package com.linh.pttkht2.controller.dao;

import com.linh.pttkht2.model.Book;

public interface BookDAO {

	void addBook();

	Book getBook(Book book);

	void getAllBook();

	void update();

	void delete();

}