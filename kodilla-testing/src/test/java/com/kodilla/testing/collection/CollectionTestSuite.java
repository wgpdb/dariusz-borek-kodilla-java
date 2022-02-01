package com.kodilla.testing.collection;

import java.util.*;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case: end");
    }

    @DisplayName(
            "When creating an empty list, " +
            "then getNumbers list should return as empty"
    )

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        // Given
        List<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator one = new OddNumbersExterminator(emptyList);

        // When
        int result = one.getNumbers().size();
        System.out.println("Testing list if empty " + result);

        // Then
        Assertions.assertEquals(0, result);
    }

    @DisplayName(
            "When creating a non-empty list, " +
            "then getNumbers size should return correct value"
    )

    @Test
    public void testOddNumbersExterminatorNormalList() {

        // Given
        List<Integer> normalList = List.of(2, 5);
        OddNumbersExterminator one = new OddNumbersExterminator(normalList);

        // When
        int result = one.getNumbers().size();
        System.out.println("Testing if list has entries " + result);

        // Then
        Assertions.assertEquals(2, result);
    }

    @DisplayName(
            "When creating a list od odd and even Integers, " +
            "OddNumbersExterminator should return list with even Integers"
    )

    @Test
    public void testOddNumbersExterminatorExtermination() {

        // Given
        List<Integer> oddAndEvenList = Arrays.asList(2, 5, 8, 9, 12, 15);
        OddNumbersExterminator one = new OddNumbersExterminator(oddAndEvenList);
        one.exterminate();

        // When
        List<Integer> result = one.exterminate();
        System.out.println("Testing if list has only even Integers " + result);

        // Then
        Assertions.assertEquals(Arrays.asList(2, 8, 12), result);
    }
}