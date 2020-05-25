package org.example.MakingDecisionsPart2;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        //constraints
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("The largest number is " + firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("The largest number is " + secondNumber);
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("The largest number is " + thirdNumber);
        }
    }
}
