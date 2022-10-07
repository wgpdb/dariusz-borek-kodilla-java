package com.kodilla.good.patterns.food2door;

public class Supplier implements SupplierOnboarding {

    private String supplierName;
    private SupplierStockRepository supplierStockRepository;

    public Supplier() {
    }

    public Supplier(String supplierName, SupplierStockRepository supplierStockRepository) {
        this.supplierName = supplierName;
        this.supplierStockRepository = supplierStockRepository;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public SupplierStockRepository getSupplierStockRepository() {
        return supplierStockRepository;
    }

    @Override
    public Supplier onboardNewSupplier(String newSupplierName, SupplierStockRepository supplierStockRepository) {
        supplierName = newSupplierName;
        return new Supplier(supplierName, supplierStockRepository);
    }
}