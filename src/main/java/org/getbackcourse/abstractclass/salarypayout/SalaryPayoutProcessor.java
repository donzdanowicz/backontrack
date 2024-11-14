package org.getbackcourse.abstractclass.salarypayout;

import java.time.LocalDateTime;

public class SalaryPayoutProcessor extends SalaryPayout {

    public SalaryPayoutProcessor(Employee employee, String currency) {
        super(employee, currency);
    }

    protected void payout() {
        System.out.println("Sending payout to employee...");
        System.out.println(LocalDateTime.now() + ": " + employee.calculateSalary() + " " + currency + " sent to employee.");

    }
}
