package com.kodilla.good.patterns.challenges.ecommerce;

import java.time.LocalDateTime;
import java.util.HashMap;

public class CompletedOrderRepository implements OrderRepository {

    private final HashMap<Long, OrderRequest> completedOrders = new HashMap<>();

    @Override
    public boolean createOrder(User user, Order order, LocalDateTime orderDate) {

        System.out.println("User: " + user.getUserName() + "\n" +
                "Order: " + order.getProductName() + " / " + order.getProductStockNumber() + "\n" +
                "Price: " + order.getProductPrice() + "\n" +
                "Date: " + orderDate);

        return true;
    }

    @Override
    public void addCompletedOrderToRepository(OrderRequest orderRequest) {
        if (orderRequest != null) {
            completedOrders.put(orderRequest.getOrderRequestNumber(), orderRequest);
            System.out.println("Order saved in completed orders repository: " +
                    completedOrders.containsKey(orderRequest.getOrderRequestNumber()));
        }
    }

    public HashMap<Long, OrderRequest> getCompletedOrders() {
        return new HashMap<>(completedOrders);
    }
}