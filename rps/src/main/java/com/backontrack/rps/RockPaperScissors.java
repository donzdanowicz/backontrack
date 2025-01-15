package com.backontrack.rps;

import java.util.Random;
import java.util.Scanner;

public abstract class RockPaperScissors {
    protected final Scanner scanner = new Scanner(System.in);
    protected final Random random = new Random();
    protected String name;
    protected int rounds;
    protected int playerScore;
    protected int computerScore;
    protected boolean doNotPlayAgain;
    protected boolean end;

    abstract void run();
    abstract void moveInstructions();
    abstract boolean playerWins(int playersNumericKey, int computersNumericKey);

    protected void welcome() {
        System.out.println("Welcome to Standard Rock Paper Scissors Game.");
    }

    protected void askForName() {
        System.out.println("What's your name?");
        this.name = scanner.next();
    }

    protected void howManyRounds() {
        System.out.println("How many rounds do you want to play?");
        boolean isKeyCorrect = false;

        while (!isKeyCorrect) {
            String roundsString = scanner.next();
            if (isNumeric(roundsString)) {
                this.rounds = Integer.parseInt(roundsString);
                System.out.println("Let's play " + rounds + "!");
                isKeyCorrect = true;
            } else {
                System.out.println("Wrong key. Enter a number.");
            }
        }
    }

    protected void instructions() {
        System.out.println(name + ", let's begin our game. It's over after " + rounds + " wins of player or computer (ties don't count).");
    }

    protected void play(int moves) {
        String key = scanner.next();

        if (key.equals("x")) {
            System.out.println("The end.");
            end = true;
        } else if (key.equals("n")) {
            System.out.println("New game.");
            end = true;
        } else if (isNumeric(key) && isCorrectMove(key, moves)) {
            playRound(key, moves);
        } else {
            wrongKeyTryAgain();
            moveInstructions();
        }

        if (playerScore == rounds || computerScore == rounds) {
            whoIsAWinner();
            end = true;
        }
    }

    private boolean isCorrectMove(String key, int max) {
        return Integer.parseInt(key) >= 1 && Integer.parseInt(key) <= max;
    }

    protected void playRound(String key, int moves) {
        int playersNumericKey = Integer.parseInt(key);
        int computersNumericKey = random.nextInt(moves) + 1;

        System.out.println("Your move: " + playersNumericKey + ". Computer's move: " + computersNumericKey + ".");

        if (playersNumericKey == computersNumericKey) {
            System.out.println("It's a tie");
        } else if (playerWins(playersNumericKey, computersNumericKey)) {
            playerScore++;
            System.out.println("You win this round.");
        } else {
            computerScore++;
            System.out.println("Computer wins this round.");
        }
    }

    protected void wrongKeyTryAgain() {
        System.out.println("Wrong key. Try again.");
    }

    protected void whoIsAWinner() {
        System.out.println("Game over.");
        if (playerScore > computerScore) {
            System.out.println("You win! You won " + playerScore + " rounds.");
        } else if (computerScore > playerScore) {
            System.out.println("Computer won " + computerScore + " rounds.");
        } else {
            System.out.println("It's a tie." + playerScore + ":" + computerScore);
        }
    }

    protected void playAgain() {
        System.out.println("Do you want to play again? Enter Y/N");

        boolean isKeyCorrect = false;

        while (!isKeyCorrect) {

            String playAgainString = scanner.next();

            if (playAgainString.equalsIgnoreCase("Y")) {
                System.out.println("Let's play again!");
                end = false;
                isKeyCorrect = true;
            } else if (playAgainString.equalsIgnoreCase("N")) {
                System.out.println("Thanks for playing.");
                doNotPlayAgain = true;
                isKeyCorrect = true;
            } else {
                System.out.println("Wrong key. Choose Y or N");
            }
        }
    }

    protected boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
