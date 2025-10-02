package com.backontrack.goodpatterns.challenges.productorderservice;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService orderProcessor = new ProductOrderService(
                new MailInformationService(), new BookOrderService(), new BookOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
