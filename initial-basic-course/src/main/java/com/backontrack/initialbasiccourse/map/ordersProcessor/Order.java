package com.backontrack.initialbasiccourse.map.ordersProcessor;

import java.util.Objects;

public class Order {
    private int orderNumber;
    private String name;
    private String category;
    private double price;

    public Order(int orderNumber, String name, String category, double price) {
        this.orderNumber = orderNumber;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderNumber == order.orderNumber && Double.compare(price, order.price) == 0 && Objects.equals(name, order.name) && Objects.equals(category, order.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, name, category, price);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
