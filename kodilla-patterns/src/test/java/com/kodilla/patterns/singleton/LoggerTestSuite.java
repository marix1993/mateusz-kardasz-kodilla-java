package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void openLogger() {
        logger = Logger.INSTANCE;
        logger.log("monday");
    }

    @Test
    void testGetLastLog(){
        //Given
        String log = logger.getLastLog();
        //When
        String log1 = "monday";
        //Then
        Assertions.assertEquals(log, log1);


    }
}
