package com.linh.pttkht2.model;

import java.util.Date;

public class Author {

	private int authorID;
	private String name;
	private Date dob;

	public Author(int authorID, String name, Date dob) {
		this.authorID = authorID;
		this.name = name;
		this.dob = dob;
	}

	public int getAuthorID() {
		return authorID;
	}

	public void setAuthorID(int authorID) {
		this.authorID = authorID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
}