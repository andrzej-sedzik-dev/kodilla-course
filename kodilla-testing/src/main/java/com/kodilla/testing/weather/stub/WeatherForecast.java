package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }


    // metoda licząca średnią temperaturę
    public double getAverageTemperature() {
        double sum = 0;

        // zliczamy wszystkie wartości z tej mapy
        for (Map.Entry<String, Double> entry : temperatures.getTemperatures().entrySet()) {
            sum += entry.getValue();
        }

        // dzielimy wynik przez ilość elementów
        return sum / temperatures.getTemperatures().size();
    }


    // metoda licząca medianę
    // a) parzysta
    // 2 4 6 8 - mediana to jest średnia z dwóch środkowych elementów tutaj 4,6.
    // b) nie parzysta
    // 2, 4, 6, 8 , 10 - medianą jest środkowy element — tutaj 6.


    // musimy zrobić listę wartości typu Double
    // posortować ją
    // znaleźć środek listy
    public double getMedianTemperature() {
        // mapa potrafi zwrócić wszystkie wartości w postaci kolekcji
        // List<Double> values = temperatures.getTemperatures().values();
        // List<Double> values = (List<Double>) temperatures.getTemperatures().values();
        List<Double> values = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(values);
        int center = values.size() / 2;

        if (values.size() % 2 == 0) {
            // poszukujemy środkowego elementu
            return (values.get(center) + values.get(center - 1)) / 2;
        } else {
            return values.get(center);
        }
    }

    // to do - teraz musimy napisać do tego testy.
    // time: 17.00


}
