package com.backontrack.initialbasiccourse.map.ordersProcessor;

public class Application {
    public static void main(String[] args) {
        OrdersProcessor processor = new OrdersProcessor();

        Order order1 = new Order(11119, "Lenovo Gaming", "Computers", 1119.99);
        Order order2 = new Order(1112, "Samsung Galaxy", "Mobile Phones", 299.99);
        Order order3 = new Order(145, "Realme 8 PRO", "Mobile Phones", 199.49);
        Order order4 = new Order(11119, "Lenovo Gaming", "Computers", 1119.99);
        Order order5 = new Order(11119, "Asus A40", "Computers", 1319.99);

        processor.addOrder(order1);
        processor.addOrder(order2);
        processor.addOrder(order3);
        processor.addOrder(order4);
        processor.addOrder(order5);

        processor.printOrders();
    }
}
