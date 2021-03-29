package com.bookstore.pttkht.model;

public class CartItem {
  private Cart cart;
  private Item item;

  public CartItem() {
  }

  public CartItem(Cart cart, Item item) {
    this.cart = cart;
    this.item = item;
  }

  public Cart getCart() {
    return cart;
  }

  public void setCart(Cart cart) {
    this.cart = cart;
  }

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }
}
