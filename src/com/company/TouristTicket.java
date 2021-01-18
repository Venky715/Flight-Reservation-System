package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TouristTicket {
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
    private String hotelAddress;
    private String[] selectedTouristLocations;

    public TouristTicket(String pnr, String from, String to, Flight flight, String departureDateTime,
                         String arrivalDateTime, Passenger passenger, String seatNo, float price,
                         String hotelAddress) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.flight = flight;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.passenger = passenger;
        this.seatNo = seatNo;
        this.price = price;
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocations = new String[5];
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

    public String getHotelAddress(){
        return hotelAddress;
    }

    public String[] getTouristLocations() {
        return selectedTouristLocations;
    }

    public void addTouristLocation(String location){
        int i;
        for(i=0;i<5;i++){
            if(selectedTouristLocations[i]==null){
                selectedTouristLocations[i]=location;
                break;
            }
        }
        if(i==5){
            System.out.println("Cannot add more than 5 locations!");
        }
        else{
            System.out.println("Location added successfully!");
        }
    }

    public void removeTouristLocation(String location){
        int i;
        for(i=0;i<5;i++){
            if(selectedTouristLocations[i]!=null && selectedTouristLocations[i].equals(location)){
                selectedTouristLocations[i]=null;
                break;
            }
        }
        if(i==5){
            System.out.println("Location not added previously!");
        }
        else{
            System.out.println("Location removed successfully!");
        }
    }
}
