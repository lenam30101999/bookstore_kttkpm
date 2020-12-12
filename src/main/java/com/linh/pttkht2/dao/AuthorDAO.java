package com.linh.pttkht2.dao;

import com.linh.pttkht2.model.Author;

import java.util.List;

public interface AuthorDAO {

	void addAuthor(Author a);

	List<Author> getAllAuthors();

	Author getAuthor(int id);

	void update(Author a);

	void delete(int id);

}