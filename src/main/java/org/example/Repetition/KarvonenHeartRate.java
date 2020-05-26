package org.example.Repetition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KarvonenHeartRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your age?");
        int age = 0;
        try {
            age = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You entered a non-numeric value for age!");
            System.exit(1);
        }

        System.out.println("What's your resting heart rate?");
        int restingHR = 0;
        try {
            restingHR = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You entered a non-numeric value for resting heart rate!");
            System.exit(1);
        }

        System.out.println("Intensity \t\t Rate");
        for (double intensity = 55; intensity <=95; intensity=intensity + 5) {
            double targetHeartRate = (((220 - age) - restingHR) * intensity/100) + restingHR;
            System.out.printf("\t%.0f%%", intensity );
            System.out.printf("\t\t\t%.0fbpm \t\t\t\n", targetHeartRate);
        }
    }
}