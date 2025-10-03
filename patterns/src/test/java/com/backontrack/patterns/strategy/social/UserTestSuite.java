package com.backontrack.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User brian = new AlphaGeneration("Brian");
        User luke = new ZGeneration("Luke");
        User andrew = new Millenials("Andrew");

        //When

        System.out.printf("%s says: %s\n", brian.getName(), brian.sharePost());
        System.out.printf("%s says: %s\n", luke.getName(), luke.sharePost());
        System.out.printf("%s says: %s\n", andrew.getName(), andrew.sharePost());

        //Then
        assertEquals("I use Snapchat.", brian.sharePost());
        assertEquals("I use Facebook.", luke.sharePost());
        assertEquals("I use Twitter.", andrew.sharePost());
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User brian = new AlphaGeneration("Brian");
        User luke = new ZGeneration("Luke");
        User andrew = new Millenials("Andrew");

        //When

        System.out.printf("%s says: %s\n", brian.getName(), brian.sharePost());
        brian.setSocialPublisher(new FacebookPublisher());
        System.out.printf("%s now says: %s\n", brian.getName(), brian.sharePost());

        //Then
        assertEquals("I use Facebook.", brian.sharePost());
    }
}
