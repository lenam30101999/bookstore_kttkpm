package com.linh.pttkht2.controller.impl;

import com.linh.pttkht2.controller.dao.ItemDAO;
import com.linh.pttkht2.model.Author;
import com.linh.pttkht2.model.Book;
import com.linh.pttkht2.model.Item;
import com.linh.pttkht2.model.Publisher;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDAOImpl implements ItemDAO {

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

	public void addItem(Item i) {
		// TODO - implement ItemDAOImpl.addItem
		throw new UnsupportedOperationException();
	}

	public List<Item> getItems() {
		//TODO: Remove Test code
		List<Item> items = new ArrayList<>();
		ResultSet rs = null;
		try {
			Connection connection = getConnection();
			String strQuery = "select BookID, book.name AS book_name, book.price from book";
			PreparedStatement preparedStatement = connection.prepareStatement(strQuery);
			rs = preparedStatement.executeQuery(strQuery);
			System.out.println(strQuery);

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int bookId = rs.getInt("BookID");
				String name = rs.getString("book_name");
				double price =rs.getDouble("price");

				Item item =new Item();
				item.setItemID(bookId);
				item.setName(name);
				item.setPrice(price);

				items.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return items;
	}

	public Item getItem(int id) {
		// TODO - implement ItemDAOImpl.getItem
		throw new UnsupportedOperationException();
	}

	public void update(Item i) {
		// TODO - implement ItemDAOImpl.update
		throw new UnsupportedOperationException();
	}

	public void delete(int id) {
		// TODO - implement ItemDAOImpl.delete
		throw new UnsupportedOperationException();
	}

}