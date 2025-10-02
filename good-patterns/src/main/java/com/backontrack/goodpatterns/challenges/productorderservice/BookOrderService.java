package com.backontrack.goodpatterns.challenges.productorderservice;

public class BookOrderService implements OrderService {
    public boolean order(User user, Product product) {
        System.out.println(user);
        System.out.println(product);
        System.out.printf("Ordering book: %s for USD%s for %s.\n", product.getProductName(), product.getPrice(), user.getName());

        return true;
    }
}
