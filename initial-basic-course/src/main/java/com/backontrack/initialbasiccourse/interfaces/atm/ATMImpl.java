package com.backontrack.initialbasiccourse.interfaces.atm;

public class ATMImpl implements ATM{

    @Override
    public void cashIn() {
        System.out.println("How much money do you want to cash in?");
        System.out.println("Cashing in...");
    }

    public void draw() {
        System.out.println("How much money do you want to draw?");
        System.out.println("Drawing the money...");
    }
}
