package com.linh.pttkht2.controller.impl;

import com.linh.pttkht2.controller.dao.BookDAO;
import com.linh.pttkht2.model.Author;
import com.linh.pttkht2.model.Book;
import com.linh.pttkht2.model.Publisher;

import java.sql.*;

public class BookDAOImpl extends ConnectionDAO implements BookDAO {

	private String jdbcURL = "jdbc:mysql://localhost:3306/pttkht_btl";
	private String jdbcUsername = "root";
	private String jdbcPassword = "phamlong4101999";

	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public void addBook() {
		// TODO - implement BookDAOImpl.addBook
		throw new UnsupportedOperationException();
	}

	public Book getBook(Book book) {
		Statement stmt = null;
		ResultSet rs = null;
		Book dbBook = new Book();
		dbBook.setBookID(book.getBookID());
		try {
			Connection connection = getConnection();
			String strQuery = "select book.BookID, book.Name AS book_name, book.NumPage, author.Name AS author_name, " +
					"publisher.Name AS publisher_name from book,author,publisher where author.authorID = book.AuthorAuthorID " +
					"and book.publisherPubID = publisher.PubID; and book.BookID=?";
			PreparedStatement preparedStatement = connection.prepareStatement(strQuery);
			preparedStatement.setInt(1,book.getBookID());
			rs = stmt.executeQuery(strQuery);
			System.out.println(strQuery);

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