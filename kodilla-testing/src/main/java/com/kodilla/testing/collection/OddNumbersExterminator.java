package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    private List<Integer> numbers;

    public OddNumbersExterminator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public List<Integer> exterminate() {

        List<Integer> evenNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}
