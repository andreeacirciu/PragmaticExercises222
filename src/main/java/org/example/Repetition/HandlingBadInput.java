package org.example.Repetition;

import java.util.Scanner;

public class HandlingBadInput {
    public static void main(String[] args) {
        //constraints and challenge
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the rate of return?");
        String rate = scanner.nextLine();

        while (rate.matches("[0, a-zA-Z]+")) {
            if (rate.matches("[0]")) {
                System.out.println("Sorry. Cannot be divided by zero. \nEnter the rate again: ");
                rate = scanner.nextLine();
            } else if (rate.matches("[a-zA-Z]+")) {
                System.out.println("Sorry. That's not a valid input. \nEnter the rate again: ");
                rate = scanner.nextLine();
            }
        }
        years(rate);
    }

    static void years(String rate) {
        int intRate = Integer.parseInt(rate);
        double years = 72.0 / intRate;
        System.out.println("It will take " + years + " years to double your initial investment.");

    }
}