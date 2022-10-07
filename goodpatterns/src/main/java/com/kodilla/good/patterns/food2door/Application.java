package com.kodilla.good.patterns.food2door;

public class Application {

    public static void main(String[] args) {

        Product organicApple = new Product("Organic Apple", 5.99);
        Product organicPear = new Product("Organic Pear", 8.59);
        Product glutenFreeBread = new Product("Gluten Free Bread", 10.50);

        Supplier extraFoodShop = new Supplier("Extra Food Shop",
                new SupplierStockRepository(organicApple, 200));

        Supplier healthyShop = new Supplier("Healthy Shop",
                new SupplierStockRepository(organicApple, 250));

        Supplier glutenFreeShop = new Supplier("Gluten Free Shop",
                new SupplierStockRepository(glutenFreeBread, 50));

        Supplier newSupplier = new Supplier();
        newSupplier.onboardNewSupplier("Organic Farmers Market",
                new SupplierStockRepository(organicPear, 120));

        OrderProcessor orderProcessor = new OrderProcessor();

        Order order1 = new Order(extraFoodShop, organicApple, 10);
        orderProcessor.process(order1, true);

        Order order2 = new Order(newSupplier, organicPear, 20);
        orderProcessor.process(order2, false);
    }
}