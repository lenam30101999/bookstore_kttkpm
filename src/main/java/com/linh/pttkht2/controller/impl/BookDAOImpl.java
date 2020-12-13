package com.linh.pttkht2.controller.impl;

import com.linh.pttkht2.controller.dao.BookDAO;
import com.linh.pttkht2.model.Author;
import com.linh.pttkht2.model.Book;
import com.linh.pttkht2.model.Publisher;

import java.sql.*;

public class BookDAOImpl extends ConnectionDAO implements BookDAO {

	private String SEARCH_BOOK = "select book.BookID, book.Name AS book_name, book.NumPage, author.Name AS author_name, " +
			"publisher.Name AS publisher_name from book,author,publisher where author.authorID = book.AuthorAuthorID " +
			"and book.publisherPubID = publisher.PubID and book.BookID=?";

	public void addBook() {
		// TODO - implement BookDAOImpl.addBook
		throw new UnsupportedOperationException();
	}

	public Book getBook(Book book) {
		Statement stmt = null;
		ResultSet rs;
		Book dbBook = new Book();
		dbBook.setBookID(book.getBookID());
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_BOOK);
			preparedStatement.setInt(1,book.getBookID());
			rs = stmt.executeQuery(SEARCH_BOOK);
			System.out.println(SEARCH_BOOK);

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int bookID = rs.getInt("BookID");
				String name = rs.getString("book_name");
				int numPage = rs.getInt("NumPage");
				String authorName = rs.getString("author_name");
				String namePublisher = rs.getString("publisher_name");

				dbBook.setBookID(bookID);
				dbBook.setName(name);
				dbBook.setNumPage(numPage);
				dbBook.setAuthor(new Author(0, authorName, null));
				dbBook.setPublisher(new Publisher(0, namePublisher));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dbBook;
	}

	public void getAllBook() {
		// TODO - implement BookDAOImpl.getAllBook
		throw new UnsupportedOperationException();
	}

	public void update() {
		// TODO - implement BookDAOImpl.update
		throw new UnsupportedOperationException();
	}

	public void delete() {
		// TODO - implement BookDAOImpl.delete
		throw new UnsupportedOperationException();
	}

}