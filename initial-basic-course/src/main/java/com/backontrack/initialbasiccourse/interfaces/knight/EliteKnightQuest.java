package com.backontrack.initialbasiccourse.interfaces.knight;

public class EliteKnightQuest implements Quest {
    private static String NAME = "Elite Knight Quest";

    public void process() {
        System.out.println(NAME + " begins...");
        System.out.println("- Sir Knight, you are the only Knight suitable for this quest");
        System.out.println("- What should I do?");
        System.out.println("- Kill the Black Knight!");
        System.out.println("- I will, my Excellency.");
        System.out.println("A week long voyage... Numerous adventures on the way...");
        System.out.println("And a successful end");
        System.out.println("- Here's Black Knight's head.");
        System.out.println("- You're simply the best, sir Knight");
        System.out.println("Brave Knight finished the quest.");
    }
}
