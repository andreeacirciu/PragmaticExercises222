package org.example.MakingDecisions;


import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        final String password = "1234";
        Scanner scanner = new Scanner(System.in);
        System.out.println("password: ");
        String introducedPassword = scanner.nextLine();


        if (introducedPassword.equals(password)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("I dont't know you.");
        }
    }
}