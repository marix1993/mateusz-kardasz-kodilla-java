package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.*;

public class CollectionTestSuite {

    private static OddNumbersExterminator oddNumbersExterminator;

    @BeforeEach
    public void before() {
        System.out.println("Test case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test case: end");
    }

    @BeforeAll
    public static void beforeClass() {
        oddNumbersExterminator = new OddNumbersExterminator();
    }

    @DisplayName
            ("Checking if the class behaves correctly, " + "when the list is empty")

    @Test
    void testOddNumbersExterminatorEmptyList(){

        //Given
        List<Integer> emptyList = new ArrayList<>();

        //When
        List<Integer> newEmptyList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");

        //Then
        Assertions.assertEquals(emptyList, newEmptyList);
    }

    @DisplayName
            ("Chcecking if the class behaves correctly, " + "when the list contains even and odd numbers")

    @Test
    void testOddNumbersExterminatorNormalList() {

        //Given
        List<Integer> newList = new ArrayList<>();
        newList.add(1);
        newList.add(3);
        newList.add(5);
        newList.add(7);
        newList.add(10);
        newList.add(9);
        newList.add(12);

        List<Integer> resultList = new ArrayList<>();
        resultList.add(2);
        resultList.add(4);
        resultList.add(8);
        resultList.add(10);
        resultList.add(12);
        resultList.add(14);
        resultList.add(16);

        //When
        List<Integer> newResultList = oddNumbersExterminator.exterminate(newList);
        System.out.println("Testing normal List");
        //Then
        Assertions.assertNotEquals(resultList, newResultList);
    }
}