package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {


    // Konstruktor zostały wygenerowane z testów. // alt+enter create constructor
    // Z konstruktora wyciągnęliśmy użyte pole. // create field.
    // Dodaliśmy getter.

    private String countryName;
    private BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {

        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    // Struktura obiektów
    // Mamy klasę World, która zawiera listę obiektów typu Continent, każdy obiekt Continent zawiera listę obiektów typu Country.
    // Wewnątrz każdego Country jest informacja o ilości ludzi [peopleQuantity]
    // World -> Continent -> Country [peopleQuantity]
    // Trzeba w klasie World napisać metodę, która używając streamów, wyliczy łączną liczbę ludzi na całym świecie.
    // Rozpoczniemy od przygotowania testów klasy World.


    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
