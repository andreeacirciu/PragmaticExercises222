package org.example.MakingDecisions;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        //constraints and challenges
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the order amount?");
        int amount = scanner.nextInt();
        System.out.println("What is the state?");
        String state = scanner.next();

        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        if (state.equalsIgnoreCase("WI") || state.equalsIgnoreCase("Wisconsin")) {
            double tax = 0.55;
            System.out.println("The subtotal is " + currencyFormatter.format(amount) + "\nThe tax is " + currencyFormatter.format(tax)+ "\nThe total is: " + currencyFormatter.format((Math.ceil(amount + tax))));
           System.exit(0);
        }
            System.out.println("The total is: " + currencyFormatter.format(amount));
    }
}
