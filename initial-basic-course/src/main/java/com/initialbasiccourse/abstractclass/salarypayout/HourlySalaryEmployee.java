package com.initialbasiccourse.abstractclass.salarypayout;

public class HourlySalaryEmployee implements Employee {
    private final double hours;
    private final double hourlyPay;

    public HourlySalaryEmployee(double hours, double hourlyPay) {
        this.hours = hours;
        this.hourlyPay = hourlyPay;
    }

    public double calculateSalary() {
        return hours * hourlyPay;
    }
}
