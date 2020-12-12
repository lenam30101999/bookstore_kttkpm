package com.linh.pttkht2.model;

public class Publisher {

	private int pubID;
	private String name;

	public Publisher(int pubID, String name) {
		this.pubID = pubID;
		this.name = name;
	}

	public int getPubID() {
		return pubID;
	}

	public void setPubID(int pubID) {
		this.pubID = pubID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}