package com.backontrack.initialbasiccourse.interfaces.atm;

public class Application {
    public static void main(String[] args) {
       ATMImpl implementation = new ATMImpl();

       implementation.connect();

       implementation.cashIn();

       implementation.draw();

       ATM.endOfAction();

    }
}