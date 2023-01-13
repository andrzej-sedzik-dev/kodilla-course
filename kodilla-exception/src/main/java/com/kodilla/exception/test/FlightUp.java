package com.kodilla.exception.test;

public class FlightUp {
    public static void main(String[] args) throws RouteNotFoundException {
        FlightFinder flightFinder = new FlightFinder();
        System.out.println(flightFinder.findFlight(new Flight("Warszawa","Kraków")));
        System.out.println(flightFinder.findFlight(new Flight("Warszawa","Piła")));
    }
}
