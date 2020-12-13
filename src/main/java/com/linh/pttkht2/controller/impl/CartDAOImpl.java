package com.linh.pttkht2.controller.impl;

import com.linh.pttkht2.controller.dao.CartDAO;
import com.linh.pttkht2.model.Book;
import com.linh.pttkht2.model.Cart;
import com.linh.pttkht2.model.Customer;
import com.linh.pttkht2.model.Item;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartDAOImpl extends ConnectionDAO implements CartDAO {
	Cart cart = new Cart();

	public Cart add(Book book, int quantity) {
		String SEARCH_BOOK = "SELECT BookID, Name, NumPage FROM pttkht_btl.Book WHERE BookID = ?";
		Item item = new Item();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_BOOK);
			preparedStatement.setInt(1, book.getBookID());
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				book.setBookID(rs.getInt("ItemID"));
				book.setName(rs.getString("Name"));
				book.setNumPage(rs.getInt("NumPage"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (book != null && item.getQuantity() > 0){
			item.setBook(book);
			item.setName(book.getName());
			item.setQuantity(quantity);

			List<Item> items = cart.getItems();
			items.add(item);

			cart.setTotalQuantity(cart.getTotalQuantity() + item.getQuantity());
			cart.setItems(items);
		}
		return cart;
	}

	@Override
	public void save(Cart cart) {
		String sql = "INSERT INTO pttkht_btl.Cart(totalQuantity) VALUES (?)";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, cart.getTotalQuantity());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Cart get() {
		// TODO - implement CartDAOImpl.get

		return cart;
	}

	public Cart get(int id) {
		// TODO - implement CartDAOImpl.get
		throw new UnsupportedOperationException();
	}

	public void update(Cart c) {
		// TODO - implement CartDAOImpl.update
		throw new UnsupportedOperationException();
	}

	public void delete(int id) {
		List<Item> items = cart.getItems();
		items.remove(id);
		cart.setItems(items);
	}

}