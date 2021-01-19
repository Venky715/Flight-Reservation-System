package com.company;

public class Passenger {
    private static int idCounter = 0;
    private int id;
    private Address address;
    private Contact contact;

    private static class Address {
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

    private static class Contact {
        private String name;
        private String phone;
        private String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public void updateName(String name) {
            this.name = name;
        }

        public void updatePhone(String phone) {
            this.phone = phone;
        }

        public void updateEmail(String email) {
            this.email = email;
        }

        public String getContactDetails() {
            return name + ", " + phone + ", " + email;
        }
    }

    public Passenger(int id, String street, String city, String state, String name, String phone, String email) {
        this.id = ++idCounter;
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, phone, email);
        System.out.println("Thanks for registering with us " + name);
    }

    public int getPassengerCount() {
        return idCounter;
    }

    public Address getAddress() {
        return address;
    }

    public Contact getContact() {
        return contact;
    }
}
