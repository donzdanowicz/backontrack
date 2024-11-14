package com.backontrack.initialbasiccourse.loop.snakeletters;

import java.util.*;

public class LetterSnakeCollectionCreator {

    private final Deque<String> letterSnakes;
    private final List<String> evenLetterSnakes;
    private final List<String> oddLetterSnakes;
    private final Random snakeGenerator = new Random();

    public LetterSnakeCollectionCreator() {
        letterSnakes = new ArrayDeque<>();
        evenLetterSnakes = new ArrayList<>();
        oddLetterSnakes = new ArrayList<>();
    }

    public String createLetterSnake(int bound) {
        StringBuilder snakeBuilder = new StringBuilder("a");
        for (int k = 0; k < bound; k++) {
            snakeBuilder.append("a");
        }
//            snake.append("a".repeat(snakeGenerator.nextInt(50))); - another possibility
        return snakeBuilder.toString();
    }

    public void addLetterSnakesToArrayDeque(int amountOfSnakes) {
        for (int n = 0; n < amountOfSnakes; n++) {
            letterSnakes.offer(createLetterSnake(snakeGenerator.nextInt(50)));
        }
    }

    public Deque<String> getLetterSnakesArrayDeque() {
        return letterSnakes;
    }

    public void printLetterSnakesArrayDeque() {
        System.out.println("\nLetter Snakes");
        for (String snake : letterSnakes) {
            System.out.println(snake);
        }
    }

    public void divideLetterSnakesIntoEvenAndOddLists() {
        for (String letterSnake : letterSnakes) {
            if (letterSnake.length() % 2 == 0) {
                evenLetterSnakes.add(letterSnake);
            } else {
                oddLetterSnakes.add(letterSnake);
            }
        }
    }

    public List<String> getEvenLetterSnakes() {
        return evenLetterSnakes;
    }

    public void printEvenLetterSnakes() {
        System.out.println("\nEven Letter Snakes:");
        for (String snake : evenLetterSnakes) {
            System.out.println(snake);
        }
    }

    public List<String> getOddLetterSnakes() {
        return oddLetterSnakes;
    }

    public void printOddLetterSnakes() {
        System.out.println("\nOdd Letter Snakes:");
        for (String snake : oddLetterSnakes) {
            System.out.println(snake);
        }
    }

    public void printEvenContraOddLetterSnakeWar() {
        System.out.println("\nLetter Snake War begins...");
        int rounds;
        boolean isEvenListBigger = evenLetterSnakes.size() > oddLetterSnakes.size();
        if (isEvenListBigger) {
            rounds = oddLetterSnakes.size();
        } else {
            rounds = evenLetterSnakes.size();
        }
        String temporaryEvenLetterSnake;
        String temporaryOddLetterSnake;
        String temporaryWinner;
        int evenCounter = 0;
        int oddCounter = 0;
        for (int i = 0; i < rounds; i++) {
            temporaryEvenLetterSnake = evenLetterSnakes.get(i);
            temporaryOddLetterSnake = oddLetterSnakes.get(i);

            if (temporaryEvenLetterSnake.length() > temporaryOddLetterSnake.length()) {
                temporaryWinner = temporaryEvenLetterSnake;
                evenCounter++;
            } else {
                temporaryWinner = temporaryOddLetterSnake;
                oddCounter++;
            }

            System.out.println("Round #" + i + ": " + temporaryEvenLetterSnake + " vs " + temporaryOddLetterSnake + ". Winner is: " + temporaryWinner);
        }
        System.out.println("Even letter snakes: " + evenCounter);
        System.out.println("Odd letter snakes: " + oddCounter);

        if (evenCounter > oddCounter) {
            System.out.println("Even letter snakes win!");
        } else if (oddCounter > evenCounter) {
            System.out.println("Odd letter snakes win!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
