package com.kodilla.stream.world;

// W klasie World napisz metodę getPeopleQuantity() zwracającą liczbę typu BigDecimal,
// która używając flatMap() oraz reduce() obliczy sumę ludności wszystkich krajów na
// wszystkich kontynentach.


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class World {

    private List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    // stream
    // jak to zrobić ?
    public BigDecimal getPeopleQuantity() {
        // idziemy po kolekcji continents, puszczamy na niej stream.
        // Obecnie przez strumień przepływa nam strumień obiektów typu kontynent.
        // My chcemy przejść na kraje, a więc zejść poziom niżej, do tego używamy
        // Kolektora flatMap, który na wejściu otrzymuje jakiś kontynent.
        // .flatMap(c -> c.getCountries().stream())
        // teraz na wyjściu mamy strumień obiektów typu country
        // teraz z każdego country chcemy wyciągnąć liczbę ludzi.
        // .map(c -> c.getPeopleQuantity())
        // na wejściu mamy c, czyli country i z tego country chcemy
        // wyciągnąć getPeopleQuantity().
        // teraz na wyjściu strumienia mamy strumień liczb typu BigDecimal.
        // .forEach(System.out::println);
        // return BigDecimal.ZERO;
        // 38000000
        // 49000000
        // 270000000
        // 600000000
        // na tym etapie możemy sobie wyświetlić na chwilę.
        // test oczywiście nie przejdzie:
        //expected: <417000000> but was: <0>
        //Expected :417000000
        //Actual   :0
        // ale zobaczyliśmy, że lecą przez niego liczby.
        // Mamy więc ten strumień liczb i teraz musimy go zsumować,
        // możemy to zrobić na dwa sposoby. Spróbujemy użyć kolektora reduce,
        // który wymaga, wartości początkowej, a potem wyrażenie lambda dwu
        // parametrowe, które modyfikuje tę wartość.
        // BigDecimal.ZERO - wartość początkowa
        // Drugim parametrem będzie lambda która ma dotychczasową sumę tepSum
        // i current, czyli bieszący przyrost
        // .reduce(BigDecimal.ZERO, (tempSum, current) -> )
        // .reduce(BigDecimal.ZERO, (tempSum, current) -> tempSum.add(current));
        // test przeszedł na zielono, uzyskaliśmy 417 mln
        // możemy to zastąpić referencją do metody
        // .reduce(BigDecimal.ZERO, BigDecimal::add);

        return continents.stream()
                .flatMap(c -> c.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
                //.reduce(BigDecimal.ZERO, this::reducePeople);
    }

    // to wyrażenie lambda ->tempSum.add(current) jest odpowiednikiem takiej metody:
    public BigDecimal reducePeople(BigDecimal currentSum, BigDecimal currentDelta) {
        return currentSum = currentDelta.add(currentDelta);
    }
}
