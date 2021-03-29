package com.bookstore.pttkht.controller.impl;

import com.bookstore.pttkht.controller.dao.CartDAO;
import com.bookstore.pttkht.model.Cart;
import com.bookstore.pttkht.model.Item;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CartDAOImpl extends ConnectionDAO implements CartDAO {
	protected Cart cart = new Cart();
	int id;

	public Cart add(Book book, int quantity) {
		String SEARCH_BOOK = "SELECT BookID, Name, NumPage, Price FROM pttkht_btl.Book WHERE BookID = ?";
		Item item = new Item();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_BOOK);
			preparedStatement.setInt(1, book.getBookID());
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				book.setBookID(rs.getInt("BookID"));
				book.setName(rs.getString("Name"));
				book.setNumPage(rs.getInt("NumPage"));
				book.setPrice(rs.getDouble("Price"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (book != null && quantity > 0){
			List<Item> items = cart.getItems();

			if (Objects.isNull(items)){
				items = new ArrayList<>();
			}

			item.setItemID(id);
			item.setBook(book);
			item.setName(book.getName());
			item.setQuantity(quantity);

			if (checkExist(item, items)){
				items.add(item);
				id++;
			}

			cart.setTotalQuantity(cart.getTotalQuantity() + item.getQuantity());
			cart.setItems(items);
		}
		return cart;
	}

	@Override
	public void save(Cart cart) {

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
		items.removeIf(item -> item.getItemID() == id);
		cart.setItems(items);
	}

	private boolean checkExist(Item item, List<Item> items){
		if (items != null){
			for (int i = 0; i < items.size(); i++){
				if (items.get(i).getName().equals(item.getName())){
					items.get(i).setQuantity(items.get(i).getQuantity() + 1);
					items.set(i, items.get(i));
					return false;
				}
			}
		}
		return true;
	}
}