package com.kodilla.patterns.builder.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaTestSuite {

    @Test
    void testPizzaNew() {
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("onion")
                .bottom("thin")
                .sauce("spicy")
                .ingredient("ham")
                .ingredient("mushrooms")
                .build();

        System.out.println(pizza);

        //When
        int howManyIngredients = pizza.getIngredients().size();

        //Then
        assertEquals(3, howManyIngredients);
    }
}