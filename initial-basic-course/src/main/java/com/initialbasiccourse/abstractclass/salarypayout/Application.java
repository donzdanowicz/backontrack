package com.initialbasiccourse.abstractclass.salarypayout;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        FixedSalaryEmployee fixedSalaryEmployee = new FixedSalaryEmployee(2000);
        HourlySalaryEmployee hourlySalaryEmployee = new HourlySalaryEmployee(40, 19);
        PayPerProductEmployee payPerProductEmployee = new PayPerProductEmployee(5, 19);
        BonusEmployee bonusEmployee = new BonusEmployee(2000, 20, true);

        List<Employee> employees = new ArrayList<>();
        employees.add(fixedSalaryEmployee);
        employees.add(hourlySalaryEmployee);
        employees.add(payPerProductEmployee);
        employees.add(bonusEmployee);

        for (Employee employee: employees) {
            SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee, "USD");
            processor.processPayout();
        }
    }
}