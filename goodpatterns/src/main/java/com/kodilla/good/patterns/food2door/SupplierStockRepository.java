package com.kodilla.good.patterns.food2door;

public class SupplierStockRepository implements SupplierStock {

    private final Product product;
    private final int productQuantity;

    public SupplierStockRepository(final Product product, final int productQuantity) {
        this.product = product;
        this.productQuantity = productQuantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    @Override
    public void collectSupplierStock(Supplier supplier, Product product, int productQuantity) {

    }
}