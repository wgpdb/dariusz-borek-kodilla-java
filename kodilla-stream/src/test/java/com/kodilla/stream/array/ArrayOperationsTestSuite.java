package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

        //Given
        int[] testNumbers = new int[]{2, 5, 6, 1, 9, 7};

        //When
        ArrayOperations.getAverage(testNumbers);

        //Then
        assertEquals(5, ArrayOperations.getAverage(testNumbers));
    }
}