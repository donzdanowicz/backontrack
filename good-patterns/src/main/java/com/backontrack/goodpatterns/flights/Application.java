package com.backontrack.goodpatterns.flights;

import static com.backontrack.goodpatterns.flights.Constants.*;

public class Application {
    public static void main(String[] args) {
        FlightDatabaseRetriever flightDatabaseRetriever = new FlightDatabaseRetriever();
        FlightFinder flightFinder = flightDatabaseRetriever.retrieve();

        System.out.println("\nDirect Flights: \n");

        System.out.println("Flights from GDA");
        System.out.println(flightFinder.findDirectFlightsFrom(GDA));

        System.out.println("Flights to LDZ");
        System.out.println(flightFinder.findDirectFlightsTo(LDZ));

        System.out.println("Flights from WRO to LDZ");
        System.out.println(flightFinder.findDirectFlightsFromTo(WRO, LDZ));


        System.out.println("\nTransfer Flights: \n");

        System.out.println("Flights from GDA to WRO");
        System.out.println(flightFinder.findTransferFlightsFromTo(GDA, WRO));
    }
}
