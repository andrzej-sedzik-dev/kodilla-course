package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {


    @Test
    void testDefaultShareMedium() {
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User kodilla = new ZGeneration("Kodilla");

        //When
        String stevenShare = steven.sharePost("post");
        System.out.println("Steven share: " + stevenShare);
        String johnShare = john.sharePost("post");
        System.out.println("John share: " + johnShare);
        String kodillaShare = kodilla.sharePost("post");
        System.out.println("Kodilla share: " + kodillaShare);

        //Then
        assertEquals("Facebook share post", stevenShare);
        assertEquals("Snapchat share post", johnShare);
        assertEquals("Twitter share post", kodillaShare);
    }

    @Test
    void testIndividualSharingMedium() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        String stevenShare = steven.sharePost("post");
        System.out.println("Steven share: " + stevenShare);
        steven.setSocialPublisher(new TwitterPublisher());
        stevenShare = steven.sharePost("post");
        System.out.println("Steven now share: " + stevenShare);

        //Then
        assertEquals("Twitter share post", stevenShare);
    }

}
