package org.getbackcourse.abstractclass.banktransaction;

public class ATM extends Bank {
    protected void enterCard() {
        System.out.println("Enter your Card");
    }

    protected void enterPIN() {
        System.out.println("Enter PIN");
    }

    protected void enterPayoutAmount() {
        System.out.println("Enter payout amount");
    }

    protected void cashOut() {
        System.out.println("Cash out in progress...");
        System.out.println("Cash out completed ");
    }

    protected void thankForTheTransaction() {
        System.out.println("Thank you for the transaction");
    }
}
