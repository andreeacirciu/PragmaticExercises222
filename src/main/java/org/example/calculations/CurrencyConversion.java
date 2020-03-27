package org.example.calculations;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        //constraints
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many euros are you exchanging?");
//        double euro = scanner.nextDouble();
//        System.out.println("What is the exchange rate?");
//        double exchangeRateUSDollar =scanner.nextDouble();
//
//       double usDollars = euro * exchangeRateUSDollar;
//       String output = String.format(" %.2f euros at an exchange rate of %.2f is %.2f us dollars.", euro, exchangeRateUSDollar, usDollars);
//        System.out.println(output);

        //challenges
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the country: ");
        String country = scanner.nextLine();

        switch (country) {
            case "bulgaria":
                System.out.println("How many euros are you exchanging?");
                double euro = scanner.nextDouble();
                double exchangeRateGBP = 1.96;
                double bulgarianMoney = euro * exchangeRateGBP;
                Locale locale = new Locale("en", "BG");
                NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
                String output = String.format(" %.2f euro at an exchange rate of %.2f is %s.", euro, exchangeRateGBP, currencyFormatter.format(bulgarianMoney));
                System.out.println(output);
                break;
            case "turkey":
                System.out.println("How many euros are you exchanging?");
                double euro1 = scanner.nextDouble();
                double exchangeRateTurkishLira = 6.97;
                double turkishMoney = euro1 * exchangeRateTurkishLira;
                Locale locale1 = new Locale("en", "TR");
                NumberFormat currencyFormatter1 = NumberFormat.getCurrencyInstance(locale1);
                String output1 = String.format(" %.2f euro at an exchange rate of %.2f is %s.", euro1, exchangeRateTurkishLira, currencyFormatter1.format(turkishMoney));
                System.out.println(output1);
                break;
            case "romania":
                System.out.println("How many euros are you exchanging?");
                double euro2 = scanner.nextDouble();
                double exchangeRateRomanianRon = 4.84;
                double romanianMoney = euro2 * exchangeRateRomanianRon;
                Locale locale2 = new Locale("en", "RO");
                NumberFormat currencyFormatter2 = NumberFormat.getCurrencyInstance(locale2);
                String output2 = String.format(" %.2f euro at an exchange rate of %.2f is %s.", euro2, exchangeRateRomanianRon, currencyFormatter2.format(romanianMoney));
                System.out.println(output2);
                break;
            case "moldavia":
                System.out.println("How many euros are you exchanging?");
                double euro3 = scanner.nextDouble();
                double exchangeRateMoldavianLeu = 19.48;
                double moldavianMoney = euro3 * exchangeRateMoldavianLeu;
                Locale locale3 = new Locale("en", "MD");
                NumberFormat currencyFormatter3 = NumberFormat.getCurrencyInstance(locale3);
                String output3 = String.format(" %.2f euro at an exchange rate of %.2f is %s.", euro3, exchangeRateMoldavianLeu, currencyFormatter3.format(moldavianMoney));
                System.out.println(output3);
                break;
            case "canada":
                System.out.println("How many euros are you exchanging?");
                double euro4 = scanner.nextDouble();
                double exchangeRateCanadianDollar = 1.55;
                double canadianMoney = euro4 * exchangeRateCanadianDollar;
                Locale locale4 = new Locale("en", "CA");
                NumberFormat currencyFormatter4 = NumberFormat.getCurrencyInstance(locale4);
                String output4 = String.format(" %.2f euro at an exchange rate of %.2f is %s.", euro4, exchangeRateCanadianDollar, currencyFormatter4.format(canadianMoney));
                System.out.println(output4);
                break;
            case "usa":
                System.out.println("How many euros are you exchanging?");
                double euro5 = scanner.nextDouble();
                double exchangeRateUSDollar = 1.09;
                double americanMoney = euro5 * exchangeRateUSDollar;
                Locale locale5 = new Locale("en", "US");
                NumberFormat currencyFormatter5 = NumberFormat.getCurrencyInstance(locale5);
                String output5 = String.format(" %.2f euros at an exchange rate of %.2f is %s.", euro5, exchangeRateUSDollar, currencyFormatter5.format(americanMoney));
                System.out.println(output5);
                break;
            case "hungary":
                System.out.println("How many euros are you exchanging?");
                double euro6 = scanner.nextDouble();
                double exchangeRateHungarianForint = 354.97;
                double hungarianMoney = euro6 * exchangeRateHungarianForint;
                Locale locale6 = new Locale("en", "HU");
                NumberFormat currencyFormatter6 = NumberFormat.getCurrencyInstance(locale6);
                String output6 = String.format(" %.2f euros at an exchange rate of %.2f is %s.", euro6, exchangeRateHungarianForint, currencyFormatter6.format(hungarianMoney));
                System.out.println(output6);
                break;
            default:
                System.out.println("The entered country is not in our list but you can still calculate if you know the exchange rate.\nWhat is the exchange rate?");
                double exchangeRate = scanner.nextDouble();
                System.out.println("How many euros are you exchanging?");
                double euro7 = scanner.nextDouble();
                double exchangedMoney = euro7 * exchangeRate;
                String output7 = String.format(" %.2f euros at an exchange rate of %.2f is %.2f.", euro7, exchangeRate, exchangedMoney);
                System.out.println(output7);
        }
    }

}

