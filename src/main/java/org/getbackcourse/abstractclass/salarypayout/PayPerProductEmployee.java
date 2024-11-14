package org.getbackcourse.abstractclass.salarypayout;

public class PayPerProductEmployee implements Employee {
    double payPerProduct;
    int noOfProducts;

    public PayPerProductEmployee(double payPerProduct, int noOfProducts) {
        this.payPerProduct = payPerProduct;
        this.noOfProducts = noOfProducts;
    }

    public double calculateSalary() {
        return payPerProduct * noOfProducts;
    }
}
