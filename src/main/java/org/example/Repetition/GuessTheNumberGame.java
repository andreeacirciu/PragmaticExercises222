package org.example.Repetition;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        System.out.println("Let's play \"Guess the Number!\"");
        playGuessNumberGame();

    }

    static void playGuessNumberGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int difficultyLevel = 0;
        int numberOfGuesses = 0;
        System.out.println("Pick a difficulty level(1, 2 or 3): ");
        try {
            difficultyLevel = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You entered a non-numeric value!");
        }

        if (difficultyLevel == 1) {
            int randomNumber = random.nextInt(10);
            System.out.println("I have my number. What's your guess?");
            int guess1 = scanner.nextInt();
            numberOfGuesses++;
            while (guess1 != randomNumber) {
                if (guess1 < randomNumber) {
                    System.out.println("Too low. Guess again: ");
                } else {
                    System.out.println("Too high. Guess again: ");
                }
                guess1 = scanner.nextInt();
                numberOfGuesses++;
                if (guess1 == randomNumber) {
                    System.out.println("You got it in " + numberOfGuesses + " guesses.");
                    messageForNumberOfGuesses(numberOfGuesses);
                    System.out.println("Play again?(y/n)");
                    String answer = scanner.next();
                    scanner.nextLine();
                    if (answer.equals("n")) {
                        System.out.println("Goodbye!");

                    } else if (answer.equals("y")) {
                        playGuessNumberGame();
                    }
                }
            }
        } else if (difficultyLevel == 2) {
            int randomNumber = random.nextInt(100);
            System.out.println("I have my number.What's your guess?");

            int guess1 = scanner.nextInt();
            numberOfGuesses++;
            while (guess1 != randomNumber) {
                if (guess1 < randomNumber) {
                    System.out.println("Too low. Guess again: ");
                } else {
                    System.out.println("Too high. Guess again: ");
                }
                guess1 = scanner.nextInt();
                numberOfGuesses++;
                if (guess1 == randomNumber) {
                    System.out.println("You got it in " + numberOfGuesses + " guesses.");
                    messageForNumberOfGuesses(numberOfGuesses);
                    System.out.println("Play again?(y/n)");
                    String answer = scanner.next();
                    scanner.nextLine();
                    if (answer.equals("n")) {
                        System.out.println("Goodbye!");

                    } else if (answer.equals("y")) {
                        playGuessNumberGame();
                    }


                }
            }
        } else if (difficultyLevel == 3) {
            int randomNumber = random.nextInt(1000);
            System.out.println("I have my number. What's your guess? ");
            int guess1 = scanner.nextInt();
            numberOfGuesses++;
            while (guess1 != randomNumber) {
                if (guess1 < randomNumber) {
                    System.out.println("Too low. Guess again: ");
                } else {
                    System.out.println("Too high. Guess again: ");
                }
                guess1 = scanner.nextInt();
                numberOfGuesses++;
                if (guess1 == randomNumber) {
                    System.out.println("You got it in " + numberOfGuesses + " guesses.");
                    messageForNumberOfGuesses(numberOfGuesses);
                    System.out.println("Play again?(y/n)");
                    String answer = scanner.next();
                    scanner.nextLine();
                    if (answer.equals("n")) {
                        System.out.println("Goodbye!");
                    } else if (answer.equals("y")) {
                        playGuessNumberGame();
                    }
                }
            }
        }
    }

    static void messageForNumberOfGuesses(int numberOfGuesses){
        if(numberOfGuesses ==1){
            System.out.println("You're a mind reader!");
        }else if(numberOfGuesses>=2 && numberOfGuesses<=4){
            System.out.println("Most impressive!");
        }else if(numberOfGuesses>=3 && numberOfGuesses <=6){
            System.out.println("You can do better than that!");
        }else if(numberOfGuesses>=7){
            System.out.println("Better luck next time!");
        }
    }
}
