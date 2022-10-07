package com.kodilla.good.patterns.challenges.ecommerce;

public class Order {

    private final String productName;
    private final long productStockNumber;
    private final double productPrice;

    public Order(final String productName, final long productStockNumber, final double productPrice) {
        this.productName = productName;
        this.productStockNumber = productStockNumber;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public long getProductStockNumber() {
        return productStockNumber;
    }

    public double getProductPrice() {
        return productPrice;
    }
}