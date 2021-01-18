package com.company;

public class Main {

    public static void main(String[] args) {
        Flight flight1 = new Flight("IG345", "Indigo", 200);
        Address address1 = new Address("Gandhi Street", "Kolkata", "West Bengal");
        Contact contact1 = new Contact("Kishan", "9874563210", "a.b@gmail.com");
        Passenger passenger1 = new Passenger(123, address1, contact1);
        TouristTicket touristTicket1 = new TouristTicket("234234", "Delhi", "Kolkata", flight1,
                "10-10-2020 01:00:00", "10-10-2020 02:00:00", passenger1, "L54",
                5644, "Hotel BlueMoon, Delhi, 500987");
        touristTicket1.addTouristLocation("ZooPark");
        touristTicket1.addTouristLocation("Museum");
        touristTicket1.addTouristLocation("Temple");
        touristTicket1.removeTouristLocation("Lake");
        touristTicket1.addTouristLocation("A");
        touristTicket1.addTouristLocation("B");
        touristTicket1.addTouristLocation("C");
    }
}
