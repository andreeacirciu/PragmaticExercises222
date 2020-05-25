package org.example.Functions;

import java.util.Scanner;

public class MonthsToPayOffACreditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your balance?");
       double balance = scanner.nextDouble();

        System.out.println("What is the APR on the card(as a percent)?");
        double apr = scanner.nextDouble();

        System.out.println("What is the monthly payment you can make?");
        double monthlyPayment = scanner.nextDouble();

        calculateMonthsUntilPaidOff(balance, apr, monthlyPayment);

    }

    static void calculateMonthsUntilPaidOff(double balance, double apr, double monthlyPayment){

        double aprDivided = (apr/100)/365;

        double x = Math.log(1+balance/monthlyPayment*(1-Math.pow(1+aprDivided, 30 )));
        double y = Math.log(1+aprDivided);
        double n = Math.ceil(-1.0/30.0 *(x/y));

        System.out.println("It will take you " + n + " months to pay off this card.");
    }
}
