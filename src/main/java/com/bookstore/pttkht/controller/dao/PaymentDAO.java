package com.bookstore.pttkht.controller.dao;

import com.bookstore.pttkht.model.Payment;

import java.util.List;

public interface PaymentDAO {

	void add(Payment p);

	List<Shipment> get();

	Shipment get(int id);

	void update(Payment p);

	void delete(int id);

}