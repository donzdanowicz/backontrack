package com.backontrack.goodpatterns.food2door;

import java.time.LocalDateTime;
import java.util.Objects;

public class NewSupply {
    private Supplier supplier;
    private LocalDateTime supplyDate;
    private String productCategory;
    private double price;
    private double quantity;

    public NewSupply(Supplier supplier, LocalDateTime supplyDate, String productCategory, double price, double quantity) {
        this.supplier = supplier;
        this.supplyDate = supplyDate;
        this.productCategory = productCategory;
        this.price = price;
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public LocalDateTime getSupplyDate() {
        return supplyDate;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NewSupply newSupply = (NewSupply) o;
        return Double.compare(price, newSupply.price) == 0 && Double.compare(quantity, newSupply.quantity) == 0 && Objects.equals(supplier, newSupply.supplier) && Objects.equals(supplyDate, newSupply.supplyDate) && Objects.equals(productCategory, newSupply.productCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplier, supplyDate, productCategory, price, quantity);
    }

    @Override
    public String toString() {
        return "NewSupply{" +
                "supplier=" + supplier +
                ", supplyDate=" + supplyDate +
                ", productCategory='" + productCategory + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
