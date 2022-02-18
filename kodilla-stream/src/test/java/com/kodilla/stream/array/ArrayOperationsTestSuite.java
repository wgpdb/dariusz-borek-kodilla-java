package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

        //Given
        int[] testNumbers = new int[]{2, 5, 6, 1, 9, 7};

        //When
        ArrayOperations.getAverage(testNumbers);

        //Then
        assertEquals(OptionalDouble.of(5), ArrayOperations.getAverage(testNumbers));
    }

    @Test
    void testWhenArrayEmpty() {

        //Given
        int[] testNumbers = new int[]{};

        //When
        ArrayOperations.getAverage(testNumbers);

        //Then
        assertEquals(OptionalDouble.empty(), ArrayOperations.getAverage(testNumbers));
    }

    @Test
    void testWhenArrayIsNull() {

        //Given
        int[] testNumbers = null;

        //When

        //Then
        assertThrows(NullPointerException.class,
                () -> {
                    ArrayOperations.getAverage(testNumbers);
                });
    }
}