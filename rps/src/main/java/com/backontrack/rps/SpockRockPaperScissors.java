package com.backontrack.rps;

public class SpockRockPaperScissors extends RockPaperScissors {

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
                play(5);
            }

            playAgain();
        }
    }

    protected void moveInstructions() {
        System.out.println("Enter 1 for rock, 2 for paper, 3 for scissors, 4 for lizard, 5 for Spock. \nEnter x to end the game or n to start a new one.");
    }

    protected boolean playerWins(int playersNumericKey, int computersNumericKey) {
        return (playersNumericKey == 1 && computersNumericKey == 3)
                || (playersNumericKey == 2 && computersNumericKey == 1)
                || (playersNumericKey == 3 && computersNumericKey == 2)
                || (playersNumericKey == 1 && computersNumericKey == 4)
                || (playersNumericKey == 4 && computersNumericKey == 5)
                || (playersNumericKey == 5 && computersNumericKey == 3)
                || (playersNumericKey == 3 && computersNumericKey == 4)
                || (playersNumericKey == 4 && computersNumericKey == 2)
                || (playersNumericKey == 2 && computersNumericKey == 5)
                || (playersNumericKey == 5 && computersNumericKey == 1) ;
    }
}
