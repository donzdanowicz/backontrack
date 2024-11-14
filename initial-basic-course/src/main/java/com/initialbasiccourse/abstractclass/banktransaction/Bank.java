package com.initialbasiccourse.abstractclass.banktransaction;

public abstract class Bank {
    abstract protected void enterCard();
    abstract protected void enterPIN();
    abstract protected void enterPayoutAmount();
    abstract protected void cashOut();
    abstract protected void thankForTheTransaction();

    private void acceptPayoutRequest() {
        System.out.println("Request for payout is accepted");
    }

    private void checkBalance() {
        System.out.println("Checking the requested amount");
    }
    private void approvePayout() {
        System.out.println("Payout is approved. The requested amount is accessible.");
    }

    public void run() {
        enterCard();
        enterPIN();
        enterPayoutAmount();
        acceptPayoutRequest();
        checkBalance();
        approvePayout();
        cashOut();
        thankForTheTransaction();
    }
}
