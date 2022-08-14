package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){

        //Given
        int numbers [] = {2,7,4,5,6,3,7,6,5,5};
        double averageExpected = 5.0;

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(averageExpected, average);
    }
}
