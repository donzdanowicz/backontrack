package com.backontrack.goodpatterns.challenges.productorderservice;

public class GameOrderRepository implements OrderRepository {
    public void createOrder(User user, Product product) {
        System.out.printf("Creating game order for %s. \n", user.getName());
    }
}
