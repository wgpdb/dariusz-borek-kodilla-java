package com.kodilla.good.patterns.challenges.ecommerce;

public class OrderDto {

    private final User user;
    private final boolean isOrderExecuted;

    public OrderDto(final User user, final boolean isOrderExecuted) {
        this.user = user;
        this.isOrderExecuted = isOrderExecuted;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrderExecuted() {
        return isOrderExecuted;
    }
}