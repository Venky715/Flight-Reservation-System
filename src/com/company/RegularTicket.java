package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegularTicket {
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
    private String specialServices;

    public RegularTicket(String pnr, String from, String to, Flight flight, String departureDateTime,
                         String arrivalDateTime, Passenger passenger, String seatNo, float price,
                         String specialServices) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.flight = flight;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.passenger = passenger;
        this.seatNo = seatNo;
        this.price = price;
        this.specialServices = specialServices;
        flight.incrementBookingCounter();
    }

    public String checkStatus() {
        return isCancelled ? "Cancelled" : "Confirmed";
    }

    public void cancel() {
        isCancelled = true;
    }

    public int getFlightDuration() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date d1 = sdf.parse(departureDateTime);
        Date d2 = sdf.parse(arrivalDateTime);
        return (int)((d2.getTime()-d1.getTime())/1000L);
    }

    public String getSpecialServices() {
        return specialServices;
    }

    public void updateSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}
