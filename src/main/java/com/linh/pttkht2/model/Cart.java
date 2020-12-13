package com.linh.pttkht2.model;

public class Cart {

	private int cartID;
	private int quantity;
	private Payment payMent;
	private Shipment shipMent;
	private Item item;

	public Cart(int cartID, int quantity, Payment payMent, Shipment shipMent, Item item) {
		this.cartID = cartID;
		this.quantity = quantity;
		this.payMent = payMent;
		this.shipMent = shipMent;
		this.item = item;
	}

	public int getCartID() {
		return cartID;
	}

	public void setCartID(int cartID) {
		this.cartID = cartID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Payment getPayMent() {
		return payMent;
	}

	public void setPayMent(Payment payMent) {
		this.payMent = payMent;
	}

	public Shipment getShipMent() {
		return shipMent;
	}

	public void setShipMent(Shipment shipMent) {
		this.shipMent = shipMent;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Cart{" +
				"cartID=" + cartID +
				", quantity=" + quantity +
				", payMent=" + payMent +
				", shipMent=" + shipMent +
				", item=" + item +
				'}';
	}
}