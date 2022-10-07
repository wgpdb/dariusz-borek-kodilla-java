package com.kodilla.good.patterns.challenges.ecommerce;

import java.time.LocalDateTime;

public interface OrderService {

    boolean order(User user, Order order, LocalDateTime orderDate);
}