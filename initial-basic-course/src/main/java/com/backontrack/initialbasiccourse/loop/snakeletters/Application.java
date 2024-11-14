package com.backontrack.initialbasiccourse.loop.snakeletters;

public class Application {
    public static void main(String[] args) {
        LetterSnakeCollectionCreator creator = new LetterSnakeCollectionCreator();

        creator.addLetterSnakesToArrayDeque(50);

        creator.printLetterSnakesArrayDeque();

        creator.divideLetterSnakesIntoEvenAndOddLists();

        creator.printEvenLetterSnakes();
        System.out.println("Size: " + creator.getEvenLetterSnakes().size());
        creator.printOddLetterSnakes();
        System.out.println("Size: " + creator.getOddLetterSnakes().size());

        creator.printEvenContraOddLetterSnakeWar();
    }
}
