package com.kodilla.good.patterns.food2door;

public class OrderProcessor implements OrderService {

    private Order order;
    private boolean isOrderCompleted;

    public Order getOrder() {
        return order;
    }

    public boolean isOrderCompleted() {
        return isOrderCompleted;
    }

    @Override
    public void process(Order order, boolean isOrderCompleted) {
        if(isOrderCompleted) {
            System.out.println("Order: " + "\n" + order.toString() + "\n" + "completed: " + isOrderCompleted);
        } else {
            System.out.println("Sorry, your order cannot be completed: " + "\n" + order);
        }
    }
}