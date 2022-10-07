package com.kodilla.good.patterns.challenges.ecommerce;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        long orderRequestNumber = 1;

        User user = new User("jsmith", "John", "Smith", "john@smith.com",
                "abc Street");

        Order order = new Order("Tooth brush", 2258, 29.99);

        LocalDateTime orderDate = LocalDateTime.now();

        return new OrderRequest(orderRequestNumber, user, order, orderDate);
    }
}