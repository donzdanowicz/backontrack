package com.backontrack.testing.forum;

import com.backontrack.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("When SimpleUser with realName is created then getRealName should return correct real name."
    )
    @Test
    void testCaseRealName() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Locke");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        String expectedResult = "John Locke";
        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @DisplayName("When SimpleUser with name is created then getUsername should return correct username.")
    @Test
    void testCaseUsername(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Locke");

        //When
        String result = simpleUser.getUsername();
        System.out.println("Testing " + result);
        String expectedResult = "theForumUser";

        //Then
        assertEquals(expectedResult, result);
    }
}
