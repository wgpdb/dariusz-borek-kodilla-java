package com.kodilla.good.patterns.challenges.ecommerce;

import java.time.LocalDateTime;

public class OrderRequest {

    private final long orderRequestNumber;
    private final User user;
    private final Order order;
    private final LocalDateTime orderDate;

    public OrderRequest(final long orderRequestNumber, final User user, final Order order,
                        final LocalDateTime orderDate) {
        this.orderRequestNumber = orderRequestNumber;
        this.user = user;
        this.order = order;
        this.orderDate = orderDate;
    }

    public long getOrderRequestNumber() {
        return orderRequestNumber;
    }

    public User getUser() {
        return user;
    }

    public Order getOrder() {
        return order;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}