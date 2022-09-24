package com.kodilla.testing.forum;
import com.kodilla.testing.user.SimpleUser;

import org.junit.jupiter.api.*;

class ForumTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin 1");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end 2");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin 3");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end 4");
    }

    @DisplayName("when create SimpleUser with realName, " +
            "then getRealName should return real user name"
    )
    @Test
    void testCaseRealName() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals("John Smith", result);
    }

    @DisplayName("when create SimpleUser with name, " +
            "then getUsername should return correct name")
    @Test
    void testCaseUsername() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        String expectedResult = "theForumUser";
        //When
        String result = simpleUser.getUsername();
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}