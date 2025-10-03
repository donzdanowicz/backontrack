package com.backontrack.patterns.strategy.investing;

import java.util.Objects;

public class Customer {
    private final String name;
    protected BuyPredictor buyPredictor;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String predict() {
        return buyPredictor.predictWhatToBuy();
    }

    public void setBuyingStrategy(BuyPredictor buyPredictor) {
        this.buyPredictor = buyPredictor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(buyPredictor, customer.buyPredictor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, buyPredictor);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", buyPredictor=" + buyPredictor +
                '}';
    }
}
