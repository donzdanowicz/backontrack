package com.backontrack.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Paris", true);
        flightMap.put("London", true);
        flightMap.put("Rome", true);
        flightMap.put("Berlin", false);
        flightMap.put("Rio de Janeiro", false);
        flightMap.put("Tokyo", false);

        if (flightMap.containsKey(flight.getArrivalAirport())) {
            return flightMap.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException();
        }
    }
}
