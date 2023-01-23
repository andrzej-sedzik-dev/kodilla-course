package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        Library library = new Library("Biblioteka Główna");
        library.getBooks().add(new Book("Lord of the rings - Fellowship of the Ring", "J.R.R. Tolkien", LocalDate.of(1954,7,29)));
        library.getBooks().add(new Book("Lord of the rings - The Two Towers", "J.R.R. Tolkien", LocalDate.of(1954,11,11)));
        library.getBooks().add(new Book("Lord of the rings - The return of the King", "J.R.R. Tolkien", LocalDate.of(1955,10,20)));

        library.getBooks().add(new Book("Krew elfów", "A. Sapkowski", LocalDate.of(1994,1,1)));
        library.getBooks().add(new Book("Ostatnie życzenie", "A. Sapkowski", LocalDate.of(1993,1,1)));

        System.out.println(library.getName());
        System.out.println(library.getBooks());

        //making a shallow copy of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Filia");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println(clonedLibrary.getName());
        System.out.println(clonedLibrary.getBooks());


        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Filia niezależna");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println(deepClonedLibrary.getName());
        System.out.println(deepClonedLibrary.getBooks());

    }
}
