package com.backontrack.initialbasiccourse.list.linkedlist.clocks;

import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Clock> clocks = new LinkedList<>();
        Clock clock1 = new Clock(1, 12, 30);
        Clock clock2 = new Clock(2, 19, 40);
        Clock clock3 = new Clock(3, 22, 40);
        clocks.add(clock1);
        clocks.add(clock2);
        clocks.add(clock3);

        for (Clock clock : clocks) {
            System.out.println("\nClock#" + clock.getNumber());
            System.out.println(clock.getTime());
        }

        System.out.println("\nADDING MINUTES TO THE CLOCKS");

        clock1.addMinutes(19);
        System.out.println("Clock#" + clock1.getNumber() + ": " + clock1.getTime());
        clock1.setTime(12, 30);

        clock1.addMinutes(39);
        System.out.println("Clock#" + clock1.getNumber() + ": " + clock1.getTime());
        clock1.setTime(12, 30);

        clock1.addMinutes(99);
        System.out.println("Clock#" + clock1.getNumber() + ": " + clock1.getTime());
        clock1.setTime(12, 30);

        clock1.addMinutes(189);
        System.out.println("Clock#" + clock1.getNumber() + ": " + clock1.getTime());
        clock1.setTime(12, 30);

        clock2.addMinutes(19);
        System.out.println("Clock#" + clock2.getNumber() + ": " + clock2.getTime());
        clock1.setTime(19,40);

        clock3.addMinutes(199);
        System.out.println("Clock#" + clock3.getNumber() + ": " + clock3.getTime());
        clock3.setTime(22, 40);

        clock3.addMinutes(10199);
        System.out.println("Clock#" + clock3.getNumber() + ": " + clock3.getTime());
        clock3.setTime(22, 40);

    }
}
