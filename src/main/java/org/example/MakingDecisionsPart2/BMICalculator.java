package org.example.MakingDecisionsPart2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        //constraints and challenges

        double BMI = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to use imperial or metric units? (imperial/metric)");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("imperial")) {
            System.out.println("What's your weight?[lbs]");
            double weight = 0;
            try {
                weight = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("You entered a non-numeric value!");
                System.exit(-1);
            }

            System.out.println("Do you want to enter your height in feet or inches? (feet/inches)");
            String answer1 = scanner.next();
            scanner.nextLine();

            if (answer1.equalsIgnoreCase("feet")) {
                System.out.println("What's your height?[feet]");

                double heightFeet = 0;
                try {
                    heightFeet = scanner.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("You entered a non-numeric value!");
                    System.exit(-1);
                }
                double heightInches = heightFeet * 12;
                BMI = (weight / (heightInches * heightInches)) * 703;

            }else if(answer1.equalsIgnoreCase("inches")){
                System.out.println("What's your height?[inches]");
                double heightInches = scanner.nextDouble();
                BMI = (weight / (heightInches * heightInches)) * 703;
            }

            //metric
        } else if (answer.equalsIgnoreCase("metric")) {
            System.out.println("What's your weight?[kg]");
            double weightKg = 0;
            try {
                weightKg = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("You entered a non-numeric value!");
                System.exit(-1);
            }

            System.out.println("What's your height?[cm]");
            double heightCm = 0;
            try {
                heightCm = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("You entered a non-numeric value!");
                System.exit(-1);
            }
            BMI = (weightKg / heightCm / heightCm) * 10000;


        }

        System.out.println("Your BMI is: " + BMI);
        if (BMI >= 18.5 && BMI <= 25) {
            System.out.println("You are within the ideal weight range.");
        } else if (BMI > 25) {
            System.out.println("You are overweight. You should see your doctor.");
        } else if (BMI < 18.5) {
            System.out.println("You are underweight. You should see your doctor.");
        }

    }
}
