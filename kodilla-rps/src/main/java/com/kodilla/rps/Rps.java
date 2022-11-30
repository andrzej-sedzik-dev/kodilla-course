package com.kodilla.rps;

public class Rps {
    public void play() {
        String username = UserDialogs.getUsername();
        int numberOfRounds = UserDialogs.getNumberOfRounds();
        int roundNumber = 1;
        int humanScore = 0;
        int computerScore = 0;


        // rozgrywka jednej rundy
        while (roundNumber <= numberOfRounds) {
            UserSelection userSelection = UserDialogs.getUserSelection();
            if (userSelection == UserSelection.QUIT) {
                return;
            }
            UserSelection computerSelection = AI.getComputerSelection();
            Winner winner = AI.calculateWinner(userSelection, computerSelection);
            if (winner == Winner.HUMAN)
                humanScore++;
            else if (winner == Winner.COMPUTER) {
                computerScore++;
            } else {
                humanScore++;
                computerScore++;
            }
            UserDialogs.displayStatus(roundNumber, numberOfRounds, userSelection, computerSelection, winner, humanScore, computerScore);
            roundNumber++;

            if (roundNumber == numberOfRounds +1)
            UserDialogs.displayFinalStats(humanScore, computerScore, numberOfRounds);
        }
    }
}
