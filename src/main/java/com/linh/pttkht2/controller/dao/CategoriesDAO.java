package com.linh.pttkht2.controller.dao;

import com.linh.pttkht2.model.Categories;

import java.util.List;

public interface CategoriesDAO {

	void addCategory(Categories c);

	List<Categories> getAllCategories();

	Categories getCategories(int id);

	void update(Categories c);

	void delete(int id);

}