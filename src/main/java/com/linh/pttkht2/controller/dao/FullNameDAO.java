package com.linh.pttkht2.controller.dao;

import com.linh.pttkht2.model.FullName;

import java.util.List;

public interface FullNameDAO {

	void add(FullName f);

	List<FullName> getFullNames();

	FullName getFullName(int id);

	void update(FullName f);

	void delete(int id);

}