package com.backontrack.goodpatterns.food2door;

import java.time.LocalDateTime;

public class ExtraFoodShopOrderingProcess implements OrderingProcess {
    public void createOrder(Supplier supplier, LocalDateTime supplyDate, String productCategory,
                            double price, double quantity) {
        System.out.println("Send e-mail with order.");
        System.out.println("New supply from " + supplier.getCompanyName() + " will be delivered on " + supplyDate + ".");
        System.out.println("Check invoice and send transfer after a delivery.");
    }
}
