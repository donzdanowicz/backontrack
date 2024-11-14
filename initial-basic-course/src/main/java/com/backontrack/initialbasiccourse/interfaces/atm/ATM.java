package com.backontrack.initialbasiccourse.interfaces.atm;

public interface ATM {
    void cashIn();

    void draw();

    default void connect() {
        System.out.println("Connected to the bank.");
    }

    static void endOfAction() {
        System.out.println("ATM processing ended.");
    }
}
