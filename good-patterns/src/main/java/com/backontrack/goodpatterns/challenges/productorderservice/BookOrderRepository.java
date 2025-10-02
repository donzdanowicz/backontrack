package com.backontrack.goodpatterns.challenges.productorderservice;

public class BookOrderRepository implements OrderRepository {
    public void createOrder(User user, Product product) {
        System.out.printf("Creating book order for %s. \n", user.getName());
    }
}
