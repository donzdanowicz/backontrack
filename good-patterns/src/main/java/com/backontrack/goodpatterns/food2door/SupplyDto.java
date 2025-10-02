package com.backontrack.goodpatterns.food2door;

public class SupplyDto {
    private Supplier supplier;
    private boolean isOrdered;

    public SupplyDto(Supplier supplier, boolean isOrdered) {
        this.supplier = supplier;
        this.isOrdered = isOrdered;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
