package com.company;

public class Passenger {
    private int id;
    private Address address;
    private Contact contact;

    public Passenger(int id, Address address, Contact contact) {
        this.id = id;
        this.address = address;
        this.contact = contact;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
