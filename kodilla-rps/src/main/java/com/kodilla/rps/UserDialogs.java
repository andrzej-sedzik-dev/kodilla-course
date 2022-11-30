package com.kodilla.rps;

import java.util.Scanner;

public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What's your name?");
            String s = scanner.nextLine();
            if (s.trim().length() < 3) {
                System.out.println("Your name has to consist of 3 characters at least");
            } else {
                return s;
            }
        }


    }

    public static int getNumberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("How many rounds do you want to play?");
            String s = scanner.nextLine();
            try {
                int n = Integer.parseInt(s);
                if (n >= 1 && n <= 9) {
                    return n;
                } else {
                    System.out.println("Number of round should be between 1 and 9");
                }
            } catch (Exception e) {
                System.out.println("Wrong number, try again");
            }

        }
    }

    public static UserSelection getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your move - (S)scissors (R)rock, (P)paper, (Q)uit");
            String s = scanner.nextLine();
            switch (s.trim().toUpperCase()) {
                case "S":
                    return UserSelection.SCISSORS;
                case "R":
                    return UserSelection.ROCK;
                case "P":
                    return UserSelection.PAPER;
                case "Q":
                    return UserSelection.QUIT;
                default:
                    System.out.println("Wrong selection, try again");
            }
        }
    }


    public static void displayStatus(int roundNumber, int numberOfRounds, UserSelection userSelection, UserSelection computerSelection, Winner winner, int humanScore, int computerScore) {
        System.out.println("This is round number " + roundNumber + " of " + numberOfRounds);
        System.out.println("Human selected: " + userSelection);
        System.out.println("Computer selected: " + computerSelection);
        System.out.println("The winner is: " + winner);
        System.out.println("    Human score: " + humanScore);
        System.out.println("    Computer score: " + computerScore);
    }

    public static void displayFinalStats(int humanScore, int computerScore, int numberOfRounds) {
        System.out.println("-----------------------------------");
        System.out.println("Game over: ");
        System.out.println("Human score: " + humanScore);
        System.out.println("Computer score " + computerScore);
        System.out.println("Number of rounds: " + numberOfRounds);
        if (humanScore == computerScore) {
            System.out.println("Their is a: " + Winner.DRAW);
        }
        else if (humanScore > computerScore) {
            System.out.println("The Winner is: " + Winner.HUMAN);
        } else {
            System.out.println("The Winner is: " + Winner.COMPUTER);
        }
        System.out.println("-----------------------------------");
    }
}
