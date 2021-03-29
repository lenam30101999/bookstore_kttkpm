package com.bookstore.pttkht.controller.impl;

import com.bookstore.pttkht.controller.dao.ItemDAO;
import com.bookstore.pttkht.model.Item;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDAOImpl extends ConnectionDAO implements ItemDAO {

	public void addItem(Item i) {
		// TODO - implement ItemDAOImpl.addItem
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Item> getItems() {
		//TODO: Remove Test code
		List<Item> items = new ArrayList<>();
		ResultSet rs = null;
		try {
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