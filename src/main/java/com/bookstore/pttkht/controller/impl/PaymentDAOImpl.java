package com.bookstore.pttkht.controller.impl;

import com.bookstore.pttkht.controller.dao.PaymentDAO;
import com.bookstore.pttkht.model.Payment;

import java.util.List;

public class PaymentDAOImpl extends ConnectionDAO implements PaymentDAO {

	@Override
	public Payment getPayment(int paymentId) {
		return null;
	}

	public void delete(int id) {
		// TODO - implement PaymentDAOImpl.delete
		throw new UnsupportedOperationException();
	}

}