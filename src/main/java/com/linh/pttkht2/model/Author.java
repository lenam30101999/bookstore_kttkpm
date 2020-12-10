package com.linh.pttkht2.model;

import java.util.Date;

public class Author {
    private int authorId;
    private String name;
    private Date dob;

    public Author(int authorId, String name, Date dob) {
        this.authorId = authorId;
        this.name = name;
        this.dob = dob;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
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
