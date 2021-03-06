package com.company;

public class Main {

    public static void printTicketDetails(Ticket ticket) {
        System.out.println("Ticket PNR number is: " + ticket.getPnr());
    }

    public static void main(String[] args) {
        Flight flight1 = new Flight("IG345", "Indigo", 200);
        Passenger passenger1 = new Passenger(123, "Gandhi Street", "Kolkata", "West Bengal",
                "Krishna", "9874563210", "a.b@gmail.com");
        TouristTicket touristTicket1 = new TouristTicket("B234234", "Delhi", "Kolkata", flight1,
                "10-10-2020 01:00:00", "10-10-2020 02:00:00", passenger1, "L54",
                5644, "Hotel BlueMoon, Delhi, 500987");
        touristTicket1.addTouristLocation("ZooPark");
        touristTicket1.addTouristLocation("Museum");
        touristTicket1.addTouristLocation("Temple");
        touristTicket1.removeTouristLocation("Lake");
        touristTicket1.addTouristLocation("A");
        touristTicket1.addTouristLocation("B");
        touristTicket1.addTouristLocation("C");
        System.out.println(flight1.getAirline());
        RegularTicket regularTicket1 = new RegularTicket("K598455", "Mumbai", "Pune", flight1,
                "10-10-2019 01:00:00", "10-10-2019 02:00:00", passenger1, "H32",
                6598, "Food and Water");
        printTicketDetails(touristTicket1);
        printTicketDetails(regularTicket1);
    }
}
