package com.linh.pttkht2.dao;

import com.linh.pttkht2.model.Shipment;

import java.util.List;

public interface ShipmentDAO {

	void add(Shipment s);

	List<Shipment> getShipments();

	Shipment getShipment(int id);

	void update(Shipment s);

	void delete(int id);

}