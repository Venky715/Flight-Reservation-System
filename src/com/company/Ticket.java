package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Ticket {
    private String pnr;
    private String from;
    private String to;
    private Flight flight;
    private String departureDateTime;
    private String arrivalDateTime;
    private Passenger passenger;
    private String seatNo;
    private float price;
    private boolean isCancelled;


    public Ticket(String pnr, String from, String to, Flight flight, String departureDateTime,
                  String arrivalDateTime, Passenger passenger, String seatNo, float price) {
        // creates a ticket only when flight is not full
        if (!flight.checkAvailability()) {
            System.out.println("Ticket cannot be booked as flight is full!");
            return;
        }
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.flight = flight;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.passenger = passenger;
        this.seatNo = seatNo;
        this.price = price;
        flight.incrementBookingCounter();
        System.out.println("Thanks for booking a ticket with us. Have a nice journey!");
    }

    public String checkStatus() {
        return isCancelled ? "Cancelled" : "Confirmed";
    }

    public void cancel() {
        isCancelled = true;
        System.out.println("Ticket Cancelled successfully");
    }

    // returns flight duration in number of seconds by subtracting departure time from arrival time
    public int getFlightDuration() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date d1 = sdf.parse(departureDateTime);
        Date d2 = sdf.parse(arrivalDateTime);
        return (int) ((d2.getTime() - d1.getTime()) / 1000L);
    }


    public String getPnr() {
        return pnr;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public float getPrice() {
        return price;
    }
}
