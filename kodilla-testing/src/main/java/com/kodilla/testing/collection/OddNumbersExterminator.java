package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    private List<Integer> numbers;
    private List<Integer> evenNumbers = new ArrayList<>();

    public OddNumbersExterminator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public List<Integer> getEvenNumbers() {
        return evenNumbers;
    }

    public List<Integer> exterminate(List<Integer> numbers) {

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}
