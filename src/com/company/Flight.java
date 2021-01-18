package com.company;

public class Flight {
    private final String flightNumber;
    private final String airline;
    private final int capacity;
    private int bookedSeats;

    public Flight(String flightNumber, String airline, int capacity) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = 0;
    }

    public String getFlightDetails(){
        return flightNumber+" "+airline;
    }
    public boolean checkAvailability(){
        return bookedSeats<capacity;
    }
    public void incrementBookingCounter(){
        bookedSeats++;
    }
}
