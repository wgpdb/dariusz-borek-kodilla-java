package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void exceptionThrownWhenIfCatchesX() {

        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertThrows(Exception.class, () -> secondChallenge.willProbablyThrowException(2, 2));
    }

    @Test
    void exceptionThrownWhenIfCatchesY() {

        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertThrows(Exception.class, () -> secondChallenge.willProbablyThrowException(1.5, 1.5));
    }

    @Test
    void exceptionNotThrown() {

        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertDoesNotThrow(() -> secondChallenge.willProbablyThrowException(1.5, 2));
    }
}