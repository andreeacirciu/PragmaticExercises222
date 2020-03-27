package org.example.calculations;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ComputingSimpleInterest {
    public static void main(String[] args) {
        //constraints + challenges
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        double principal = scanner.nextDouble();
        System.out.println("Enter the rate[%] of interest: ");
        double rate = scanner.nextDouble();
        double ratePercent= rate / 100;
        System.out.println("Enter the number of years: ");
        double time = scanner.nextDouble();

        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        for(int i=1; i<=time; i++){
            String output1 = String.format("After year number %d, the investment will be worth %s.", i, currencyFormatter.format(calculateSimpleInterest(principal, ratePercent, i)));
            System.out.println(output1);
        }

        String output = String.format("After %.0f at %.2f, the investment will be worth %s.", time, rate, currencyFormatter.format(calculateSimpleInterest(principal, ratePercent, time)));
        System.out.println(output);
    }
    public static double calculateSimpleInterest(double a, double b, double c)
    {
        return a* (1 + (b * c));
    }
}
