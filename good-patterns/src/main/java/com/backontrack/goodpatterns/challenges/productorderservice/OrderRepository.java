package com.backontrack.goodpatterns.challenges.productorderservice;

public interface OrderRepository {
    void createOrder(User user, Product product);
}
