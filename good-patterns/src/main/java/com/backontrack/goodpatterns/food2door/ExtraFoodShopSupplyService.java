package com.backontrack.goodpatterns.food2door;

import java.time.LocalDateTime;

public class ExtraFoodShopSupplyService implements SupplyService {

    @Override
    public boolean supply(Supplier supplier, LocalDateTime supplyDate, String productCategory, double price, double quantity) {
        return true;
    }
}
