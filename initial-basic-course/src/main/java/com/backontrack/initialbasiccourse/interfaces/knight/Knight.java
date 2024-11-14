package com.backontrack.initialbasiccourse.interfaces.knight;

import java.util.Random;

public class Knight {
    private final Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public Knight() {
       this.quest = randomQuest();
    }

    public void startQuest() {
        this.quest.process();
    }

    private Quest randomQuest() {
        Quest chosenQuest = null;
        Random random = new Random();

        int randomNumber = random.nextInt(2);

        switch (randomNumber) {
            case 0:
                chosenQuest = new DeadIslandQuest();
                break;
            case 1:
                chosenQuest = new EliteKnightQuest();
                break;
        }

        return chosenQuest;
    }
}
