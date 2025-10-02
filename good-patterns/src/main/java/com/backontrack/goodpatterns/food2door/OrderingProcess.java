package com.backontrack.goodpatterns.food2door;

import java.time.LocalDateTime;

public interface OrderingProcess {
    void createOrder(Supplier supplier, LocalDateTime supplyDate, String productCategory,
                     double price, double quantity);
}
