package com.backontrack.initialbasiccourse.map.ordersProcessor;

import java.util.HashMap;
import java.util.Map;

public class OrdersProcessor {
    private Map<Integer, Order> orderMap = new HashMap<>();

    public void addOrder(Order order) {
        orderMap.put(order.getOrderNumber(), order);
    }

    public Map<Integer, Order> getOrderMap() {
        return orderMap;
    }

    public void printOrders() {
        for(Map.Entry<Integer, Order> entry: orderMap.entrySet()) {
            System.out.printf("\nOrder #%s: %s%n", entry.getKey(), entry.getValue());
        }
    }
}
