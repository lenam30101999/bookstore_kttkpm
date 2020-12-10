package com.linh.pttkht2.model;

public class Address {
    private int id;
    private String city;
    private String district;
    private String street;

    public Address(int id, String city, String district, String street) {
        this.id = id;
        this.city = city;
        this.district = district;
        this.street = street;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
