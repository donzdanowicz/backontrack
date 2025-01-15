package com.backontrack.rps;

public class StandardRockPaperScissors extends RockPaperScissors {

    public void run() {

        welcome();
        askForName();

        doNotPlayAgain = false;
        end = false;

        while (!doNotPlayAgain) {
            howManyRounds();
            instructions();
            moveInstructions();
            playerScore = 0;
            computerScore = 0;

            while (!end) {
                play(3);
            }

            playAgain();
        }
    }

    protected void moveInstructions() {
        System.out.println("Enter 1 for rock, 2 for paper, 3 for scissors. \nEnter x to end the game or n to start a new one.");
    }

    protected boolean playerWins(int playersNumericKey, int computersNumericKey) {
        return (playersNumericKey == 1 && computersNumericKey == 3)
                || (playersNumericKey == 2 && computersNumericKey == 1)
                || (playersNumericKey == 3 && computersNumericKey == 2);
    }
}