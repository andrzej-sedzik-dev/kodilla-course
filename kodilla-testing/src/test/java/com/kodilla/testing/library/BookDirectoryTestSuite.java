package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;


    @Test
        // [1]
    void testListBooksWithConditionsReturnList() {                                      // [2]

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [3]
        List<Book> resultListOfBooks = new ArrayList<>();                                // [4]
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);                   // [5]
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);    // [6]
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);    // [7]
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);                 // [8]
        resultListOfBooks.add(book1);                                                    // [9]
        resultListOfBooks.add(book2);                                                    // [10]
        resultListOfBooks.add(book3);                                                    // [11]
        resultListOfBooks.add(book4);                                                    // [12]
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);// [13]

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");        // [14]

        // Then
        assertEquals(4, theListOfBooks.size());                                          // [15]
    }


    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }


    @Test
    void testListBooksWithConditionMoreThan20() {

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                           // [1]
        List<Book> resultListOf0Books = new ArrayList<Book>();                                       // [2]
        List<Book> resultListOf15Books = generateListOfNBooks(15);                    // [3]
        List<Book> resultListOf40Books = generateListOfNBooks(40);                    // [4]


        // generuje listBookWithCondition
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))                             // [5]
                .thenReturn(resultListOf15Books);                                                 // [6]
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))                  // [7]
                .thenReturn(resultListOf0Books);                                                  // [8]
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))                 // [9]
                .thenReturn(resultListOf40Books);                                                 // [10]

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");    // [11]
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");   // [12]
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");  // [13]
        // Then

        assertEquals(0, theListOfBooks0.size());                                         // [14]
        assertEquals(15, theListOfBooks15.size());                                       // [15]
        assertEquals(0, theListOfBooks40.size());                                        // [16]
    }


    @Test
    void testListBooksWithConditionFragmentShorterThan3() {                          // [1]
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);            // [2]
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);               // [3]

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");       // [4]

        // Then
        assertEquals(0, theListOfBooks10.size());                                     // [5]
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());    // [6]
    }


    //------------------------------------------------------------
    @Test
    void testListBooksInHandsOf() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();                           // lista zawiera zero książek — pusta lista
        List<Book> resultListOf1Books = generateListOfNBooks(1);          // lista generuje jedną książkę
        List<Book> resultListOf5Books = generateListOfNBooks(5);          // lista generuje pięć książek


        // Tworzymy sobie użytkowników.
        LibraryUser user1 = new LibraryUser("a", "b", "1");
        LibraryUser user2 = new LibraryUser("b", "b", "2");
        LibraryUser user3 = new LibraryUser("c", "b", "3");


        // teraz chcemy skonfigurować naszego mocka
        when(libraryDatabaseMock.listBooksInHandsOf(user1))                                 // tutaj damy sobie przykładowego użytkownika nr1.
                .thenReturn(resultListOf0Books);                                            // wtedy zwróć pustą listę książek.

        when(libraryDatabaseMock.listBooksInHandsOf(user2))                                 // tutaj damy sobie przykładowego użytkownika nr2.
                .thenReturn(resultListOf1Books);                                            // wtedy zwróć listę z jedną książką.

        when(libraryDatabaseMock.listBooksInHandsOf(user3))                        // tutaj damy sobie przykładowego użytkownika nr3.
                .thenReturn(resultListOf5Books);                                            // wtedy zwróć listę pięciu książek.

        // When
        // oczekujemy zero książek, ma się pojawić, wtedy gdy wywołamy metodę listBooksInHandsOf dla użytkownika pierwszego.
        List<Book> theListOfBooks0 = bookLibrary.listBooksInHandsOf(user1);

        // oczekujemy jednej książki, ma się pojawić, wtedy gdy wywołamy metodę listBooksInHandsOf dla użytkownika drtrzecieg.
        List<Book> theListOfBooks1 = bookLibrary.listBooksInHandsOf(user2);

        // oczekujemy pięciu książek, ma się pojawić, wtedy gdy wywołamy metodę listBooksInHandsOf dla użytkownika drugiego.
        List<Book> theListOfBooks5 = bookLibrary.listBooksInHandsOf(user3);


        // Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(1, theListOfBooks1.size());
        assertEquals(5, theListOfBooks5.size());
    }
}




