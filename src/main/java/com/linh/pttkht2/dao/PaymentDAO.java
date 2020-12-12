package com.linh.pttkht2.dao;

import com.linh.pttkht2.model.Payment;
import com.linh.pttkht2.model.Shipment;

import java.util.List;

public interface PaymentDAO {

	void add(Payment p);

	List<Shipment> get();

	Shipment get(int id);

	void update(Payment p);

	void delete(int id);

}