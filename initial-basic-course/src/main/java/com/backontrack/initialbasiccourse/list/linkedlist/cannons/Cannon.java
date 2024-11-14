package com.backontrack.initialbasiccourse.list.linkedlist.cannons;

public class Cannon {
    private final int number;
    private boolean loaded;

    public Cannon(int number, boolean loaded) {
        this.number = number;
        this.loaded = loaded;
    }

    public void fire() {
        if (!loaded) {
            loaded = true;
            System.out.printf("\nCannon %d is not loaded.", number);
            System.out.println("\nLoading the cannon...");
        } else {
            System.out.printf("\nCannon %d was already loaded.\n", number);
        }
        System.out.println("FIIIIRE!!!");
    }

    public int getNumber() {
        return number;
    }

    public boolean isLoaded() {
        return loaded;
    }
}
