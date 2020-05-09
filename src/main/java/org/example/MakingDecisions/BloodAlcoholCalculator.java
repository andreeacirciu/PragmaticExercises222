package org.example.MakingDecisions;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class BloodAlcoholCalculator {
    public static void main(String[] args) {
        final double bodyWaterConstantMan = 0.58;
        final double bodyWaterConstantWoman = 0.49;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your weight[kg]?");
        double weightInKg = 0;
        try {
            weightInKg = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("You introduced a non-numeric value!");
        }

        scanner.nextLine();
        System.out.println("Are you a man or a woman?");
        String gender = scanner.nextLine();

        System.out.println("Please enter the number of drinks: ");

        int numberOfDrinks = 0;
        try {
            numberOfDrinks = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You introduced a non-numeric value!");
        }


        System.out.println("Please enter the amount of time[h] since you start drinking till now: ");
        double hours = 0;
        try {
            hours = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("You introduced a non-numeric value!");
        }

        System.out.println("Please insert your country: ");
        String country = scanner.nextLine();
        scanner.nextLine();

        Map<String, Double> countries = new HashMap<>();
        countries.put("Austria", 0.50);
        countries.put("Belgium", 0.50);
        countries.put("Bulgaria", 0.50);
        countries.put("Croatia", 0.50);
        countries.put("Cyprus", 0.50);
        countries.put("Czech", 0.00);
        countries.put("Estonia", 0.20);
        countries.put("Hungary", 0.00);
        countries.put("Lithuania", 0.40);
        countries.put("Norway", 0.20);
        countries.put("Poland", 0.20);
        countries.put("Romania", 0.00);
        countries.put("UK", 0.80);

        switch (gender) {
            case "man":
                double bloodAlcoholContentMan = (((0.806 * numberOfDrinks * 1.2) / (weightInKg * bodyWaterConstantMan)) - (.015 * hours)) * 10;
                System.out.println("Your BAC is :" +bloodAlcoholContentMan );

                for (Map.Entry<String, Double> entry : countries.entrySet()) {
                    if (country.equals(entry.getKey()) && bloodAlcoholContentMan <= entry.getValue()) {
                        System.out.println("Based on your BAC you can legally drive in your country!");
                    } else if(country.equals(entry.getKey()) && bloodAlcoholContentMan > entry.getValue())
                    {
                        System.out.println("You are not allowed to drive in your country!");
                    }
                }

                break;

            case "woman":
                double bloodAlcoholContentWoman = (((0.806 * numberOfDrinks * 1.2) / (weightInKg * bodyWaterConstantWoman)) - (.017 * hours)) * 10;
                System.out.println("Your BAC is :" + bloodAlcoholContentWoman);

                for (Map.Entry<String, Double> entry : countries.entrySet()) {
                    if (country.equals(entry.getKey()) && bloodAlcoholContentWoman <= entry.getValue()) {
                        System.out.println("Based on your BAC you can legally drive in your country!");
                    } else if(country.equals(entry.getKey()) && bloodAlcoholContentWoman > entry.getValue()){
                        System.out.println("You are not allowed to drive in your country!");
                    }
                }
                break;
        }

    }
}
