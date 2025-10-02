package com.backontrack.goodpatterns.flights;

import static com.backontrack.goodpatterns.flights.Constants.*;

public class FlightDatabaseRetriever {
    public FlightFinder retrieve() {
        Flight GDAWAR = new Flight(GDA, WAR);
        Flight WARGDA = new Flight(WAR, GDA);
        Flight GDALDZ = new Flight(GDA, LDZ);
        Flight LDZGDA = new Flight(LDZ, GDA);
        Flight LDZWRO = new Flight(LDZ, WRO);
        Flight WROLDZ = new Flight(WRO, LDZ);
        Flight WARWRO = new Flight(WAR, WRO);
        Flight WROWAR = new Flight(WRO, WAR);

        FlightFinder flightFinder =  new FlightFinder();

        flightFinder.addFlight(GDAWAR);
        flightFinder.addFlight(WARGDA);
        flightFinder.addFlight(GDALDZ);
        flightFinder.addFlight(LDZGDA);
        flightFinder.addFlight(LDZWRO);
        flightFinder.addFlight(WROLDZ);
        flightFinder.addFlight(WARWRO);
        flightFinder.addFlight(WROWAR);

        return flightFinder;
    }
}
