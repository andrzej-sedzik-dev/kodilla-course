package com.kodilla.rps;

import java.util.Scanner;

/*
    Zadanie: gra w papier, kamień, nożyce
    Zapewne znasz zasady tej gry, ale na wszelki wypadek je przypomnimy:

    Zasady gry
    jest to gra dla dwóch graczy,

    runda gry polega na równoczesnym zagraniu przez obu graczy jednego z ruchów, tj. kamienia, papieru lub nożyc,

    remis następuje w przypadku zagrania tego samego ruchu przez obu graczy,

    zwycięstwo następuje w przypadku wykonania ruchu bijącego przeciwnika, wedle schematu:

    kamień zgniata nożyce,
    nożyce tną papier,
    papier przykrywa kamień,
    po zakończeniu rundy rozpoczyna się kolejną, aż do osiągnięcia ustalonej liczby wygranych rund przez jednego z graczy.
    w tym przypadku zagranie nie będzie równoczesne, ponieważ człowiek będzie jako pierwszy wybierał swój ruch.
 */

/*
Obsługa gry
    Twoim zadaniem jest napisanie tej gry w Javie. Ma ona być obsługiwana za pomocą klawiatury:

    w momencie uruchomienia programu użytkownik powinien zostać zapytany o imię oraz liczbę wygranych rund,
    po których następuje zwycięstwo,
    następnie powinna zostać wyświetlona informacja dot. klawiszy służących do obsługi gry:
    klawisz 1 – zagranie "kamień",
    klawisz 2 – zagranie "papier",
    klawisz 3 – zagranie "nożyce",
    klawisz x – zakończenie gry poprzedzone pytaniem "Czy na pewno zakończyć grę?",
    klawisz n – uruchomienie gry od nowa poprzedzone pytaniem "Czy na pewno zakończyć aktualną grę?",
    po tej informacji rozpoczyna się pierwsza runda, czyli:
    wyświetlony jest komunikat z prośbą o wykonanie ruchu,
    po wciśnięciu klawisza 1-3 zostaje wylosowany ruch komputera,
    wyświetla się komunikat o wykonanych ruchach graczy, wyniku rundy i bieżącym wyniku gry (liczby wygranych rund),
    rozpoczyna się kolejna runda,
    po osiągnięciu podanej na początku liczby wygranych przez któregoś z graczy (użytkownika lub komputer),
    wyświetla się komunikat podsumowujący grę (wynik i kto wygrał) oraz wybór pomiędzy zakończeniem gry (klawisz x)
i rozpoczęciem nowej gry (klawisz n).
 */

/*
    Jak się do tego zabrać?
    Utwórz sobie w projekcie kodilla-course nowy moduł (typu "Gradle" -> "Java") o nazwie kodilla-rps
    (rps to skrót od rock-paper-scissors). Utwórz w nim strukturę katalogów src/main/java oraz src/test/java.
    Stwórz pakiet com.kodilla.rps, a w nim klasę RpsRunner zawierającą metodę main(String[] args).
    Do odczytu danych z klawiatury możesz skorzystać z klasy Scanner, której dokumentację możesz znaleźć tutaj.
    Do wykonania programu użyj pętli while (!end), gdzie zmienna boolean end inicjalnie ustawiona będzie na wartość false.
    Pamiętaj, aby zastosować podejście obiektowe – gra powinna być obiektem posiadającym metody oraz właściwości.
 */


public class RpsRunner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Jak Masz na imię ?");
//        final String imie = sc.nextLine();
//        System.out.println("Witaj " + imie);
//        System.out.println("Podaj liczbę rund");
//        final int rounds = sc.nextInt();
//        System.out.println("Liczba rund jest równa: " + rounds);


        System.out.println("Witaj Andrzej!");
        System.out.println("Oto gra Kamień i nożyce, liczba rund jest równa trzy.");
        System.out.println("-------------------------------------------");
        System.out.println("    klawisz 1 – zagranie \"kamień\",\n" +
                "    klawisz 2 – zagranie \"papier\",\n" +
                "    klawisz 3 – zagranie \"nożyce\",\n" +
                "    klawisz x – zakończenie gry poprzedzone pytaniem \"Czy na pewno zakończyć grę?\",\n" +
                "    klawisz n – uruchomienie gry od nowa poprzedzone pytaniem \"Czy na pewno zakończyć aktualną grę?\",");
        System.out.println("-------------------------------------------");
        System.out.println("Twój ruch:");


        boolean end = false;
        int one;
        int two;
        int tree;
        int x;
        int n;

        while (!end) {;
            one = sc.nextInt();
            if (one == 1) {
                System.out.println("Wybrałeś opcję nr 1 - Kamień: " + one);
                end = true;

            }

            two = sc.nextInt();
            if (two == 2) {
                System.out.println("Wybrałeś opcję nr 2 - Kamień: " + two);

            }

            tree = sc.nextInt();

            if (tree == 3) {
                System.out.println("Wybrałeś opcję nr 3 - Kamień: " + tree);
                x = sc.nextInt();

            } else  {
                System.out.println("Wybrałeś opcję nr 4 - Zakończenie gry, czy na pewno chcesz zakończyć grę T/N: ");
                end = true;
            }
        }


    }
}
