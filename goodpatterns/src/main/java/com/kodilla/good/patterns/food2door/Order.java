package com.kodilla.good.patterns.food2door;

public class Order {

    private final Supplier supplier;
    private final Product product;
    private final int orderQuantity;

    public Order(final Supplier supplier, final Product product, final int orderQuantity) {
        this.supplier = supplier;
        this.product = product;
        this.orderQuantity = orderQuantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    @Override
    public String toString() {
        return "Supplier: " + supplier.getSupplierName() + "\n" +
                "Product: " + product.getProductName() + " | Price: " + product.getProductPrice() + "\n" +
                "Quantity: " + orderQuantity;
    }
}