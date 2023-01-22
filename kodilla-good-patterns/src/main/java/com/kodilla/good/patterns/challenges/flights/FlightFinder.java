package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    private List<Flight> allFlights() {
        return List.of(
                new Flight("MIA", "FRA"),
                new Flight("FRA", "WAW"),
                new Flight("FRA", "KTW"),
                new Flight("KTW", "MUC"),
                new Flight("KTW", "WAW"),
                new Flight("WAW", "GDA")
        );
    }

    public List<Flight> findFlightsFrom(String from) {
        return allFlights().stream()
                .filter(f -> f.getFrom().equals(from))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsTo(String to) {
        return allFlights().stream()
                .filter(f -> f.getTo().equals(to))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsThrough(String from, String via, String to) {
        final List<Flight> stage1 = allFlights().stream()
                .filter(f -> f.getFrom().equals(from))
                .filter(f -> f.getTo().equals(via))
                .collect(Collectors.toList());
        final List<Flight> stage2 = allFlights().stream()
                .filter(f -> f.getFrom().equals(via))
                .filter(f -> f.getTo().equals(to))
                .collect(Collectors.toList());
        List<Flight> result = new ArrayList<>();
        result.addAll(stage1);
        result.addAll(stage2);
        return result;
    }
}
