package org.example.calculations;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class DeterminingCompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the principal amount?");
        double principal = scanner.nextDouble();
        System.out.println("What is the rate?");
        double rate = scanner.nextDouble();
        double ratePercent= rate / 100;
        System.out.println("What is the number of years?");
        double years = scanner.nextDouble();
        System.out.println("What is the number of times the interest is compounded per year?");
        double times = scanner.nextDouble();
        double a =principal * (1 + (ratePercent / times));
        double b = times*years;
        double amount = Math.pow(a, b);

        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        String output = String.format("%s invested at %.2f for %.0f years compounded %.0f times per year is %s .",
                currencyFormatter.format(principal),
                rate,
                years,
                times,
                currencyFormatter.format(amount));
        System.out.println(output);

    }
}
