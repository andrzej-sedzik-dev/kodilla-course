package com.kodilla.exception.test;

import java.util.Map;

public class FlightFinder {

    private Map<String, Boolean> airports = Map.of(
            "Katowice", true,
            "Wadowice", false,
            "Kraków", true,
            "Warszawa", false
    );

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
       String airport = flight.getArrivalAirport();
        if (airports.containsKey(airport)) {
            return airports.get(airport);
        } else {
            throw new RouteNotFoundException();
        }
    }
}
