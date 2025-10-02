package com.backontrack.goodpatterns.challenges.productorderservice;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("John", "johnny@mail.com");

        Product product = new Product("Dark Tower", 30.0);

        return new OrderRequest(user, product);
    }

}
