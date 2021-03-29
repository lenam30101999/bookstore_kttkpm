package com.bookstore.pttkht.controller.dao;

import com.bookstore.pttkht.model.Payment;

import java.util.List;

public interface PaymentDAO {

	Payment getPayment(int paymentId);

	void delete(int id);

}