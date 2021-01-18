package com.company;

public class Address {
    private String street;
    private String city;
    private String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String getAddressDetails() {
        return street + ", " + city + ", " + state;
    }

    public void updateStreet(String street) {
        this.street = street;
    }

    public void updateCity(String city) {
        this.city = city;
    }

    public void updateState(String state) {
        this.state = state;
    }
}
