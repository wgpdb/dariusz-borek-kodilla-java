package com.kodilla.good.patterns.challenges.ecommerce;

import java.time.LocalDateTime;

public interface OrderRepository {

    boolean createOrder(User user,  Order order, LocalDateTime orderDate);
    void addCompletedOrderToRepository(OrderRequest orderRequest);
}