package com.backontrack.exception.test;

public class FlightFinderApplication {
    public static void main(String[] args) throws RouteNotFoundException {
        FlightFinder flightFinder = new FlightFinder();
        Flight correctFlight = new Flight("Lodz", "Paris");
        Flight wrongFlight = new Flight("Lodz", "Buenos Aires");

        try {
            System.out.println("There is a connection to " + wrongFlight.getArrivalAirport() + ": " + flightFinder.findFlight(wrongFlight));
        } catch (RouteNotFoundException e) {
            System.out.println("There is no such Arrival airport in the data base. " + e.getClass().getSimpleName());
        }
    }
}
