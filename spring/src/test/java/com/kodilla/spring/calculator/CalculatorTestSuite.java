package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testAddCalculation() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double add = calculator.add(5.5, 4.5);

        //Then
        assertEquals(10.0, add);
    }

    @Test
    void testSubCalculation() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double sub = calculator.sub(20.5, 10.5);

        //Then
        assertEquals(10.0, sub);
    }

    @Test
    void testMulCalculation() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double mul = calculator.mul(4, 2.5);

        //Then
        assertEquals(10.0, mul);
    }

    @Test
    void testDivCalculation() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double div = calculator.div(125, 12.5);

        //Then
        assertEquals(10, div);
    }

    @Test
    void testDivByZeroCalculation() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double div = calculator.div(10.0, 0.0);

        //Then
        assertEquals(0, div);
    }
}