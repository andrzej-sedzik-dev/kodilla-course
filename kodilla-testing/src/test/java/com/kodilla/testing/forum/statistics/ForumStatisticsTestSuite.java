package com.kodilla.testing.forum.statistics;

import static org.junit.jupiter.api.Assertions.*;

// Następnie utwórz pakiet com.kodilla.testing.forum.statistics w katalogu src/test/java i stwórz zestaw testów,
// zawierający testy sprawdzające metodę calculateAdvStatistics(Statistics statistics) testowanej klasy.
// Testy zrealizuj przy pomocy mocka interfejsu Statistics.
// Przetestuj poprawność obliczeń wartości średnich dla różnych przypadków:

//  gdy liczba postów = 0,
//  gdy liczba postów = 1000,
//  gdy liczba komentarzy = 0,
//  gdy liczba komentarzy < liczba postów,
//  gdy liczba komentarzy > liczba postów,
//  gdy liczba użytkowników = 0,
//  gdy liczba użytkowników = 100.

// Uwaga! Każdy przypadek testowy powinien być osobnym testem jednostkowym.
// Śmiało możesz skorzystać też z adnotacji @BeforeEach aby przygotować dane testowe


import com.kodilla.testing.library.statistics.ForumStatistics;
import com.kodilla.testing.library.statistics.Statistics;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

// Mamy napisać testy, które sprawdzą, czy te statystyki się popranie liczą dla różnych inputów,
// czyli gdy mamy zero postów, tysiąc postów, zero komentarzy itd - 7 przypadków.
class ForumStatisticsTestSuite {


    @Test
    void testCalculateAdvStats0Posts() {
        // given
        // tworzymy obiekt naszej klasy ForumStatistics.
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = Mockito.mock(Statistics.class);

        // Założenie jest takie, że w warunkach testów, gdy jest 0 postów,
        // to pozostałe elementy mają zwracać, normalne niezerowe wartości a tylko
        // ta jedna ma mieć szczególną wartość, czyli liczba postów ma być równa zero.
        Mockito.when(statisticsMock.postsCount()).thenReturn(0);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(50);
        List<String> usersList = List.of("u1", "u2", "u3", "u4", "u5");
        Mockito.when(statisticsMock.usersNames()).thenReturn(usersList);


        // when
        // teraz chcemy na forumStatistics, wywołać metodę calculateAdvStatistics(),
        // której jako parametr musimy przekazać obiekt klasy, która implementuje interfejs statistics
        // którego, jeszcze nie mamy, dlatego zrobimy sobie mock — statisticsMock i utworzymy sobie
        // wyżej zmienną tego typu.
        forumStatistics.calculateAdvStatistics(statisticsMock);


        // then
        assertEquals(5, forumStatistics.getNumberOfUsers());
        assertEquals(0, forumStatistics.getNumberOfPosts());
        assertEquals(50, forumStatistics.getNumberOfComments());
        assertEquals(0, forumStatistics.getPostsPerUser());
        assertEquals(10, forumStatistics.getCommentsPerUser());
        assertEquals(0, forumStatistics.getCommentsPerPost());
    }

    @Test
    void testCalculateAdvStats1000Posts() {
        // given
        // tworzymy obiekt naszej klasy ForumStatistics.
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = Mockito.mock(Statistics.class);

        // Założenie jest takie, że w warunkach testów, gdy jest 0 postów,
        // to pozostałe elementy mają zwracać, normalne niezerowe wartości a tylko
        // ta jedna ma mieć szczególną wartość, czyli liczba postów ma być równa zero.
        Mockito.when(statisticsMock.postsCount()).thenReturn(1000);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(50);
        List<String> usersList = List.of("u1", "u2", "u3", "u4", "u5");
        Mockito.when(statisticsMock.usersNames()).thenReturn(usersList);


        // when
        // teraz chcemy na forumStatistics, wywołać metodę calculateAdvStatistics(),
        // której jako parametr musimy przekazać obiekt klasy, która implementuje interfejs statistics
        // którego, jeszcze nie mamy, dlatego zrobimy sobie mock — statisticsMock i utworzymy sobie
        // wyżej zmienną tego typu.
        forumStatistics.calculateAdvStatistics(statisticsMock);


        // then
        assertEquals(5, forumStatistics.getNumberOfUsers());
        assertEquals(1000, forumStatistics.getNumberOfPosts());
        assertEquals(50, forumStatistics.getNumberOfComments());
        assertEquals(200, forumStatistics.getPostsPerUser());
        assertEquals(10, forumStatistics.getCommentsPerUser());
        assertEquals(0, forumStatistics.getCommentsPerPost());
    }


    @Test
    void testCalculateAdvStats0Comments() {
        // given
        // tworzymy obiekt naszej klasy ForumStatistics.
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = Mockito.mock(Statistics.class);

        // Założenie jest takie, że w warunkach testów, gdy jest 0 postów,
        // to pozostałe elementy mają zwracać, normalne niezerowe wartości a tylko
        // ta jedna ma mieć szczególną wartość, czyli liczba postów ma być równa zero.
        Mockito.when(statisticsMock.postsCount()).thenReturn(1000);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(0);
        List<String> usersList = List.of("u1", "u2", "u3", "u4", "u5");
        Mockito.when(statisticsMock.usersNames()).thenReturn(usersList);


        // when
        // teraz chcemy na forumStatistics, wywołać metodę calculateAdvStatistics(),
        // której jako parametr musimy przekazać obiekt klasy, która implementuje interfejs statistics
        // którego, jeszcze nie mamy, dlatego zrobimy sobie mock — statisticsMock i utworzymy sobie
        // wyżej zmienną tego typu.
        forumStatistics.calculateAdvStatistics(statisticsMock);


        // then
        assertEquals(5, forumStatistics.getNumberOfUsers());
        assertEquals(1000, forumStatistics.getNumberOfPosts());
        assertEquals(0, forumStatistics.getNumberOfComments());
        assertEquals(200, forumStatistics.getPostsPerUser());
        assertEquals(0, forumStatistics.getCommentsPerUser());
        assertEquals(0, forumStatistics.getCommentsPerPost());
    }


    @Test
    void testCalculateAdvStatsCommentsLessThenPosts() {
        // given

        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = Mockito.mock(Statistics.class);


        Mockito.when(statisticsMock.postsCount()).thenReturn(1000);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(0);
        List<String> usersList = List.of("u1", "u2", "u3", "u4", "u5");
        Mockito.when(statisticsMock.usersNames()).thenReturn(usersList);


        // when
        forumStatistics.calculateAdvStatistics(statisticsMock);


        // then
        assertEquals(5, forumStatistics.getNumberOfUsers());
        assertEquals(1000, forumStatistics.getNumberOfPosts());
        assertEquals(0, forumStatistics.getNumberOfComments());
        assertEquals(200, forumStatistics.getPostsPerUser());
        assertEquals(0, forumStatistics.getCommentsPerUser());
        assertEquals(0, forumStatistics.getCommentsPerPost());
    }


    @Test
    void testCalculateAdvStatsPostsLessThanComments() {
        // given

        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = Mockito.mock(Statistics.class);


        Mockito.when(statisticsMock.postsCount()).thenReturn(100);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(1000);
        List<String> usersList = List.of("u1", "u2", "u3", "u4", "u5");
        Mockito.when(statisticsMock.usersNames()).thenReturn(usersList);


        // when
        forumStatistics.calculateAdvStatistics(statisticsMock);


        // then
        assertEquals(5, forumStatistics.getNumberOfUsers());
        assertEquals(100, forumStatistics.getNumberOfPosts());
        assertEquals(1000, forumStatistics.getNumberOfComments());
        assertEquals(20, forumStatistics.getPostsPerUser());
        assertEquals(200, forumStatistics.getCommentsPerUser());
        assertEquals(10, forumStatistics.getCommentsPerPost());
    }


    @Test
    void testCalculateAdvStatsWith0users() {
        // given

        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = Mockito.mock(Statistics.class);


        Mockito.when(statisticsMock.postsCount()).thenReturn(100);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(1000);
        List<String> usersList = List.of();
        Mockito.when(statisticsMock.usersNames()).thenReturn(usersList);

        // when
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // then
        assertEquals(0, forumStatistics.getNumberOfUsers());
        assertEquals(100, forumStatistics.getNumberOfPosts());
        assertEquals(1000, forumStatistics.getNumberOfComments());
        assertEquals(0, forumStatistics.getPostsPerUser());
        assertEquals(0, forumStatistics.getCommentsPerUser());
        assertEquals(10, forumStatistics.getCommentsPerPost());
    }


    @Test
    void testCalculateAdvStatsWith100users() {
        // given

        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = Mockito.mock(Statistics.class);


        Mockito.when(statisticsMock.postsCount()).thenReturn(100);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(1000);

        // przygotować 100 użytkowników
         List<String> usersList = List.of(
                 "u1", "u2", "u3", "u4", "u5", "u6", "u7", "u8", "u9", "u10", "u111", "u12", "u13", "u14", "u15", "u16", "u17", "u18", "u19", "u20",
                 "u21", "u22", "u23", "u24", "u25", "u26", "u27", "u28", "u29", "u30", "u31", "u32", "u33", "u34", "u35", "u1", "u2", "u3", "u4", "u5",
                 "u6", "u7", "u7", "u9", "u10", "u111", "u12", "u13", "u14", "u15", "u16", "u17", "u18", "u19", "u20", "u21", "u22", "u23", "u24", "u25",
                 "u26", "u27", "u28", "u29", "u30", "u31", "u32", "u33", "u34", "u35", "u1", "u2", "u3", "u4", "u5", "u6", "u7", "u7", "u9", "u10",
                 "u111", "u12", "u13", "u14", "u15", "u16", "u17", "u18", "u19", "u20", "u21", "u22", "u23", "u24", "u25", "u26", "u27", "u28", "u29", "u30"
         );


        Mockito.when(statisticsMock.usersNames()).thenReturn(usersList);

        // when
        forumStatistics.calculateAdvStatistics(statisticsMock);


        // then
        assertEquals(100, forumStatistics.getNumberOfUsers());
        assertEquals(100, forumStatistics.getNumberOfPosts());
        assertEquals(1000, forumStatistics.getNumberOfComments());
        assertEquals(1, forumStatistics.getPostsPerUser());
        assertEquals(10, forumStatistics.getCommentsPerUser());
        assertEquals(10, forumStatistics.getCommentsPerPost());
    }




}
