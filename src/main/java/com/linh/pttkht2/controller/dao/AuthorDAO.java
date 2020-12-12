package com.linh.pttkht2.controller.dao;

import com.linh.pttkht2.model.Author;

import java.util.List;

public interface AuthorDAO {

	void addAuthor(Author a);

	List<Author> getAllAuthors();

	Author getAuthor(Author author);

	void update(Author a);

	void delete(int id);

}