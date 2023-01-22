package com.kodilla.good.patterns.challenges.flights;

public class App {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        System.out.println(flightFinder.findFlightsFrom("KTW"));
        System.out.println(flightFinder.findFlightsTo("MIA"));
        System.out.println(flightFinder.findFlightsThrough("MIA", "FRA", "WAW"));
    }
}
