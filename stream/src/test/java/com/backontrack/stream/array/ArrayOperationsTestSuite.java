package com.backontrack.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
        //Given
        int[] integers = new int[20];
        for(int i = 0; i < 20; i++) {
            integers[i] = i * 10;
        }
        System.out.println("table length: " + integers.length);

        //When
        double receivedAverage = ArrayOperations.getAverage(integers);

        //Then
        assertEquals(9.5, receivedAverage, 0.1);
    }
}
