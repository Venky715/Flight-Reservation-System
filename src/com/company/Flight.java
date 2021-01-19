package com.company;

public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;

    public Flight(String flightNumber, String airline, int capacity) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = 0;
        System.out.println("New flight " + flightNumber + " is added to the airline " + airline);
    }

    public String getFlightDetails() {
        return flightNumber + " " + airline;
    }

    public boolean checkAvailability() {
        return bookedSeats < capacity;
    }

    public void incrementBookingCounter() {
        bookedSeats++;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }
}
