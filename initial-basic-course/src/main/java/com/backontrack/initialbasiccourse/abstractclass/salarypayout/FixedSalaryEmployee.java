package com.backontrack.initialbasiccourse.abstractclass.salarypayout;

public class FixedSalaryEmployee implements Employee {
    private final double salary;
    public FixedSalaryEmployee(double salary) {
        this.salary = salary;
    }

    public double calculateSalary() {
        return this.salary;
    }
}
