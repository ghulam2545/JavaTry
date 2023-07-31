package com.ghulam.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
    @Column(name = "town")
    private String town;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "pin_code", nullable = false)
    private int pinCode;

    public Address() { }

    public Address(String town, String city, String country, int pinCode) {
        this.town = town;
        this.city = city;
        this.country = country;
        this.pinCode = pinCode;
    }

    public String getTown() {
        return town;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}
