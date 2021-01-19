package com.company;

public class RegularTicket extends Ticket {
    private String specialServices;

    public RegularTicket(String pnr, String from, String to, Flight flight, String departureDateTime,
                         String arrivalDateTime, Passenger passenger, String seatNo, float price,
                         String specialServices) {
        super(pnr, from, to, flight, departureDateTime, arrivalDateTime, passenger, seatNo, price);
        this.specialServices = specialServices;
        flight.incrementBookingCounter();
    }

    public String getSpecialServices() {
        return specialServices;
    }

    public void updateSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}
