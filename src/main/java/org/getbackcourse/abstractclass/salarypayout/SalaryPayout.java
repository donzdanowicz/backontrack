package org.getbackcourse.abstractclass.salarypayout;

public abstract class SalaryPayout {
    protected Employee employee;
    protected String currency;

    public SalaryPayout(Employee employee, String currency) {
        this.employee = employee;
        this.currency = currency;
    }

    protected abstract void payout();

    public void processPayout() {
        System.out.println("Creating payout of " + this.employee.calculateSalary() + " " + currency + " for " + this.employee.getClass().getSimpleName() + ".");
        this.payout();
        System.out.println("Payout has been completed!");
    }
}
