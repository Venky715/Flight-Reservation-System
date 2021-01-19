package com.company;

public class TouristTicket extends Ticket {
    private String hotelAddress;
    private String[] selectedTouristLocations;

    public TouristTicket(String pnr, String from, String to, Flight flight, String departureDateTime,
                         String arrivalDateTime, Passenger passenger, String seatNo, float price,
                         String hotelAddress) {
        super(pnr, from, to, flight, departureDateTime, arrivalDateTime, passenger, seatNo, price);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocations = new String[5];
        flight.incrementBookingCounter();
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public String[] getTouristLocations() {
        return selectedTouristLocations;
    }

    public void addTouristLocation(String location) {
        int i;
        for (i = 0; i < 5; i++) {
            if (selectedTouristLocations[i] == null) {
                selectedTouristLocations[i] = location;
                break;
            }
        }
        if (i == 5) {
            System.out.println("Cannot add more than 5 locations!");
        } else {
            System.out.println(location+" added successfully!");
        }
    }

    public void removeTouristLocation(String location) {
        int i;
        for (i = 0; i < 5; i++) {
            if (selectedTouristLocations[i] != null && selectedTouristLocations[i].equals(location)) {
                selectedTouristLocations[i] = null;
                break;
            }
        }
        if (i == 5) {
            System.out.println(location+" not added previously!");
        } else {
            System.out.println(location+" removed successfully!");
        }
    }

}
