package com.backontrack.goodpatterns.food2door;

import java.time.LocalDateTime;

public class NewSupplyRetriever {
    public NewSupply retrieve() {
        Supplier supplier = new Supplier(1, "ExtraFoodShop", "John", "Wilkes",
                "Hollywood Boulevard 19 , Los Angeles, USA");
        LocalDateTime supplyDate = LocalDateTime.of(2025, 9, 29, 12, 0);
        String productCategory = "Ham";
        double price = 19.99;
        double quantity = 2;

        return new NewSupply(supplier, supplyDate, productCategory, price, quantity);
    }
}
