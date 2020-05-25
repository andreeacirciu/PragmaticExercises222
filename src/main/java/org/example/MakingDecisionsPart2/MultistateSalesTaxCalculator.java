package org.example.MakingDecisionsPart2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MultistateSalesTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the order amount?");
        int amount = scanner.nextInt();
        System.out.println("What state do you live in?");
        String state = scanner.next();

        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        if (state.equalsIgnoreCase("WI") || state.equalsIgnoreCase("Wisconsin")) {
            System.out.println("What county do you live in?");
            String county = scanner.next();
            scanner.nextLine();
            if (county.equalsIgnoreCase("EauClaire")) {
                double taxEauClaire = 0.005;
                System.out.println("The tax is: $" + taxEauClaire + "\nThe total is: $" + (amount + taxEauClaire));
                System.exit(0);
            } else if (county.equalsIgnoreCase("Dunn")) {
                double taxDunn = 0.004;
                System.out.println("The tax is: $"+  taxDunn + "\nThe total is: $" + (amount + taxDunn));
            } else {
                double tax = 0.55;
                System.out.println("The subtotal is " + currencyFormatter.format(amount) + "\nThe tax is " + currencyFormatter.format(tax) + "\nThe total is: " + currencyFormatter.format((Math.ceil(amount + tax))));
                System.exit(0);
            }

        } else if (state.equalsIgnoreCase("IL") || state.equalsIgnoreCase("Illinois")) {
            double taxIllinois = 0.08;
            System.out.println("The tax is: " + currencyFormatter.format(taxIllinois) + "\nThe total is: " + currencyFormatter.format(amount + taxIllinois));
        } else {
            System.out.println("The total is: " + currencyFormatter.format(amount));
        }
    }
}

