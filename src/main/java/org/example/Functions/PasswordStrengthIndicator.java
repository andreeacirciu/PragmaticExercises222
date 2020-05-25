package org.example.Functions;

import java.util.Scanner;

public class PasswordStrengthIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        passwordValidator(password);

    }

    static void passwordValidator(String password) {
        boolean hasLetter = false;
        boolean hasDigit = false;

        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char x = password.charAt(i);
                if (Character.isLetter(x)) {

                    hasLetter = true;
                } else if (Character.isDigit(x)) {

                    hasDigit = true;
                }

            }

            if (hasLetter && hasDigit) {
                System.out.println( "The password " + password + " is a strong password.");
            } else if (hasDigit) {
                System.out.println( "The password " + password +" is a very weak password.");
            } else if (hasLetter) {
                System.out.println("The password " + password +" is a weak password.");
            }
        } else {
            System.out.println("Password too short!!");
        }
    }
}
