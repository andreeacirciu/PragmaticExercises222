package org.example.Functions;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams.");

        System.out.println("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String secondString = scanner.nextLine();
        isAnagram(firstString, secondString);

    }

    static void isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            System.out.println("The strings have different length!");
        } else {
            char[] ArrayA = a.toCharArray();
            char[] ArrayB = b.toCharArray();

            Arrays.sort(ArrayA);
            Arrays.sort(ArrayB);
            if (Arrays.equals(ArrayA, ArrayB)) {
                System.out.println("\"" + a + "\" and " + "\"" + b + "\" are anagrams.");
            } else {
                System.out.println("\"" + a + "\" and " + "\"" + b + "\" are not anagrams.");
            }
        }

    }
}
