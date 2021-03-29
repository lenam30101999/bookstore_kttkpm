package com.bookstore.pttkht.model;

import java.util.List;

public class Cart {
	private int cartID;
	private int totalQuantity;
	private List<CartItem> cartItems;

	public Cart() {
	}

	public Cart(int cartID, int totalQuantity, List<CartItem> cartItems) {
		this.cartID = cartID;
		this.totalQuantity = totalQuantity;
		this.cartItems = cartItems;
	}

	public int getCartID() {
		return cartID;
	}

	public void setCartID(int cartID) {
		this.cartID = cartID;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}
}