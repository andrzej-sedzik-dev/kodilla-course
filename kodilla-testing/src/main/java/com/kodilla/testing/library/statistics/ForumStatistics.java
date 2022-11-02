package com.kodilla.testing.library.statistics;

public class ForumStatistics {

    // Mamy interfejs Statistics.
    // Tworzymy klasę ForumStatistics, posiadającą następujące statystyki:

    // liczbę użytkowników,
    // liczbę postów,
    // liczbę komentarzy,
    // średnią liczbę postów na użytkownika,
    // średnią liczbę komentarzy na użytkownika,
    // średnią liczbę komentarzy na post.

    // Stworzona klasa powinna mieć metodę calculateAdvStatistics(Statistics statistics).
    // która obliczy podane powyżej wartości i zapamięta je we właściwościach (polach) klasy.
    // Możesz również dopisać metodę showStatistics(), która wyświetli zapamiętane we właściwościach statystyki.
    // Potem napiszemy testy...

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;


    // Metoda calculateAdvStatistics ma dostać obiekt klasy która implementuje ten interfejs.
    // Dzięki temu będziemy mogli przekazać mocka jako parametr.
    void calculateAdvStatistics(Statistics statistics) {

        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();


        if (numberOfUsers != 0) {
            postsPerUser = numberOfPosts / numberOfUsers;
        } else {
            postsPerUser = 0;
        }


        if (numberOfUsers != 0) {
            commentsPerUser = numberOfComments / numberOfUsers;
        } else {
            commentsPerUser = 0;
        }


        if (numberOfPosts != 0) {
            commentsPerPost = numberOfComments / numberOfPosts;
        } else {
            commentsPerPost = 0;
        }

    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }
}

