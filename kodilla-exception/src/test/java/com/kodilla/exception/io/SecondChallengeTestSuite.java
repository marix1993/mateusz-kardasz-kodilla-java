package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.testng.Assert.*;

class SecondChallengeTestSuite {

    @Test
    void testReadFile()  {
//        Given
        SecondChallenge secondChallenge = new SecondChallenge();

//        When & then
        assertDoesNotThrow(()->secondChallenge.probablyIWillThrowException(1.9,1.4));
        assertDoesNotThrow(()->secondChallenge.probablyIWillThrowException(1.1,1.6));
    }

    @Test
    void testWithAFoundException(){
//        Given
        SecondChallenge secondChallenge = new SecondChallenge();

//        When & then
        assertThrows(Exception.class,()->secondChallenge.probablyIWillThrowException(2,1.5));
        assertThrows(Exception.class,()->secondChallenge.probablyIWillThrowException(0.9,1.5));
    }
}
