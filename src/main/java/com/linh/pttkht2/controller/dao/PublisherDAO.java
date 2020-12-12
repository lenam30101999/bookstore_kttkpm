package com.linh.pttkht2.controller.dao;

import com.linh.pttkht2.model.Publisher;

import java.util.List;

public interface PublisherDAO {

	void addPublisher(Publisher p);

	List<Publisher> getPublishers();

	Publisher getPublisher(int id);

	void update(Publisher p);

	void delete(int id);

}