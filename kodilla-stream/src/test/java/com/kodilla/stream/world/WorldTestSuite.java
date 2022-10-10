package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {


    // Napisz test testGetPeopleQuantity(),
    // który przetestuje czy metoda getPeopleQuantity()
    // klasy World działa prawidłowo.


    // 2:00
    @Test
    void shouldCalcQuantityOfPeople() {
        // given
        // Przygotowuje dane dwa kraje Polska i Niemcy.
        // Przygotowuje dane dwa kraje Usa i Kanada.

        // Tworze nowy kontynent Europa, do którego dodaję Polskę i Niemcy.
        // Tworzę nowy kontynent northAmerica, do którego dodaję USA i Kanadę.

        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country germany = new Country("Germany", new BigDecimal("49000000"));

        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(germany);


        Country usa = new Country("USA", new BigDecimal("270000000"));
        Country canada = new Country("Canada", new BigDecimal("60000000"));

        Continent northAmerica = new Continent("North America");
        europe.addCountry(usa);
        europe.addCountry(canada);


        World world = new World();
        world.addContinent(europe);
        world.addContinent(northAmerica);


        // when
        // Wywołujemy to, co chcemy przetestować
        // Chcemy na klasie World wywołać metodę getPeopleQuantity(),
        // która ma zwrócić jakąś liczbę typu BigDecimal.
        BigDecimal result = world.getPeopleQuantity();


        // then
        // sprawdzamy w asercji czy ten result jest równy oczekiwanej przeze mnie wartości:
        // Na całym świecie łącznie będzie 38 + 49 + 270 + 60 = 417 mln ludzi.
        assertEquals(new BigDecimal("417000000"), result);
    }
        // test przeszedł na zielono, uzyskaliśmy 417 mln

}
