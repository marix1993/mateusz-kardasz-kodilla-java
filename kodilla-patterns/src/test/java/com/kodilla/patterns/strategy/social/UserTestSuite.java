package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.TwitterPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Mareczek");
        User user2 = new YGeneration("Janek");
        User user3 = new ZGeneration("Darek");

        //When
        String user1Post = user1.post();
        System.out.println("User post: " + user1Post);
        String user2Post = user2.post();
        System.out.println("User post: " + user2Post);
        String user3Post = user3.post();
        System.out.println("User post: " + user3Post);

        //Then
        assertEquals("Publish on Facebook", user1Post);
        assertEquals("Publish on Snapchat", user2Post);
        assertEquals("Publish on Twitter", user3Post);

    }

    @Test
    public void testIndividualSharingStrategy() {
        //When
        User user1 = new Millenials("Mareczek");

        //Given
        String user1Post = user1.post();
        System.out.println("User post: " + user1Post);
        user1.setSharePost(new TwitterPublisher());
        user1Post = user1.post();
        System.out.println("User post: " + user1Post);

        //Then
        assertEquals("Publish on Twitter", user1Post);

    }
}
