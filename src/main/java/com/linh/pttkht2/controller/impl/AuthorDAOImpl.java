package com.linh.pttkht2.controller.impl;


import com.linh.pttkht2.controller.dao.AuthorDAO;
import com.linh.pttkht2.model.Author;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAOImpl implements AuthorDAO {

	private String jdbcURL = "jdbc:mysql://localhost:3306/pttkht_btl";
	private String jdbcUsername = "root";
	private String jdbcPassword = "phamlong4101999";

	private static final String SEARCH = "select * from Account where username = ? and password = ?";

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

	public void addAuthor(Author a) {
		// TODO - implement AuthorDAOImpl.addAuthor
		throw new UnsupportedOperationException();
	}

	public List<Author> getAllAuthors() {
		// TODO - implement AuthorDAOImpl.getAllAuthors
		throw new UnsupportedOperationException();
	}

	public Author getAuthor(Author author) {
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;

		try {
			conn = getConnection();

			if(conn != null) {
				stmt = conn.createStatement();
				String strQuery = "select authorID, Name "
						+ "from author where author.authorID = book.AuthorAuthorID";
				rs = stmt.executeQuery(strQuery);
				while(rs.next()) {
					Author dbAuthor = new Author(author.getAuthorID(),author.getName(),author.getDob());
					dbAuthor.setAuthorID(rs.getInt(1));
					dbAuthor.setName(rs.getString(2));
					dbAuthor.setDob(rs.getDate(3));
				}
			}
		} catch (SQLException e) {
			for(Throwable t: e) {
				t.printStackTrace();
			}
		} catch (Exception et) {
			et.printStackTrace();
		}

		return author;
	}

	public void update(Author a) {
		// TODO - implement AuthorDAOImpl.update
		throw new UnsupportedOperationException();
	}

	public void delete(int id) {
		// TODO - implement AuthorDAOImpl.delete
		throw new UnsupportedOperationException();
	}

}