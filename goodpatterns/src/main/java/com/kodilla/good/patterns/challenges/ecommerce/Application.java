package com.kodilla.good.patterns.challenges.ecommerce;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new OrderProcessor(), new CompletedOrderRepository());
        productOrderService.process(orderRequest);
    }
}