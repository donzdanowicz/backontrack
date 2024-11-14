package com.backontrack.initialbasiccourse.interfaces.knight;

public class DeadIslandQuest implements Quest {
    private static String NAME = "Dead Island Quest";

    public void process() {
        System.out.println(NAME + " begins...");
        System.out.println("Dead bodies everywhere");
        System.out.println("I'm screwed...");
        System.out.println("But I'm a Knight so I'll make it");
        System.out.println("Chop! Chop! Chop! Dead heads flying around.");
        System.out.println("Brave Knight finished the quest");
    }
}
