package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {


    // pole wygenerowane z konstruktora
    private String continentName;

    // addCountry musi zwracać listę testów,
    // wię dodaje pole typu list które, na początku
    // będzie pustą listą.
    private List<Country> countries = new ArrayList<>();


    // constructor wygenerowany z testów.
    public Continent(String continentName) {
        this.continentName = continentName;
    }

    // metoda wygenerowana z testów.
    public void addCountry(Country country) {
        // metoda będzie dodawała do kolekcji countries,
        // kraj przekazany jako parametr.
        countries.add(country);
    }


    // dodajemy gettery

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
