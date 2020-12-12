package com.linh.pttkht2.model;

public class Categories {

	private int cateID;
	private String name;

	public Categories(int cateID, String name) {
		this.cateID = cateID;
		this.name = name;
	}

	public int getCateID() {
		return cateID;
	}

	public void setCateID(int cateID) {
		this.cateID = cateID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}