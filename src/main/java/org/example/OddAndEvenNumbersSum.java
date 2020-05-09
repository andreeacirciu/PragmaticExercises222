package org.example;

import java.util.Scanner;

public class OddAndEvenNumbersSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCasesCount = scanner.nextInt();
        int oddSum = 0;
        int evenSum = 0;
        int[] maxNumbers = new int[testCasesCount];
        for (int i = 0; i < testCasesCount; i++) {
            maxNumbers[i] = scanner.nextInt();
        }
        for (int number : maxNumbers) {
            for (int i = 0; i < number; i++) {
                if (i % 2 == 1) {
                    oddSum = oddSum + i;
                } else {
                    evenSum = evenSum + i;
                }
            }
            System.out.println(evenSum + " " + oddSum);
        }

    }
}
