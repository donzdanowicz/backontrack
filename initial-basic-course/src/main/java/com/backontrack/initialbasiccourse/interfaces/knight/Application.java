package com.backontrack.initialbasiccourse.interfaces.knight;

public class Application {
    public static void main(String[] args) {
        System.out.println("Random Knight \n");
        Knight randomKnight = new Knight();
        randomKnight.startQuest();

        System.out.println("\nKnight with Dead Island Quest chosen \n");

        Knight knight = new Knight(new DeadIslandQuest());
        knight.startQuest();
    }
}