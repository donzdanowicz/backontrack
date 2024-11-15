package com.backontrack.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("TestSuite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("TestSuite: end");
    }

    @DisplayName("Test OddNumbersExterminator when list of numbers is empty.")
    @Test
    void testOddNumbersExterminator_emptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();

        //When
        List<Integer> resultList = exterminator.exterminate(numbers);
        int size = resultList.size();
        int expectedSize = 0;
        System.out.println("Expected size of exterminated list is: " + expectedSize);

        //Then
        assertEquals(expectedSize, size);

    }

    @DisplayName("Test OddNumbersExterminator when list of numbers is filled.")
    @Test
    void testOddNumbersExterminator_filledList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> numbers = Arrays.asList(1, 4, 8, 19, 20, 26);

        //When
        List<Integer> resultList = exterminator.exterminate(numbers);
        int size = resultList.size();
        int expectedSize = 4;
        System.out.println("Expected size of exterminated list is: " + expectedSize);

        //Then
        assertEquals(expectedSize, size);
    }
}
