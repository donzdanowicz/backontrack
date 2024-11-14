package com.backontrack.initialbasiccourse.loop.averagecount;

public class Application {
    public static void main(String[] args) {
        LoopManager loopManager = new LoopManager(20, 1000);

        loopManager.printTableOfContents();
        System.out.println(loopManager.calculateAverage());

        loopManager.createATable();

        loopManager.printTableOfContents();
        System.out.println(loopManager.calculateAverage());
    }
}