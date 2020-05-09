package org.example.MakingDecisions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");

        System.out.println("Press KF to convert from Fahrenheit to Kelvin.");
        System.out.println("Press FK to convert from Kelvin to Fahrenheit.");

        System.out.println("Press KC to convert from Celsius to Kelvin.");
        System.out.println("Press CK to convert from Kelvin to Celsius.");



        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        System.out.println("Your choice: " + choice);

        //c
        if ("C".equalsIgnoreCase(choice)) {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            int temperatureInFahrenheit = 0;
            try {
                temperatureInFahrenheit = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You entered a non-numeric value!");
                System.exit(-1);
            }
            int temperatureInCelsius = (temperatureInFahrenheit - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is: " + temperatureInCelsius);
            //f
        } else if ("F".equalsIgnoreCase(choice)) {
            System.out.println("Please enter the temperature in Celsius: ");
            int temperatureInCelsius = 0;
            try {
                temperatureInCelsius = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You entered a non-numeric value!");
                System.exit(-1);
            }
            int temperatureInFahrenheit = (temperatureInCelsius * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is: " + temperatureInFahrenheit);

            //KF to convert from Fahrenheit to Kelvin
        }else if("KF".equalsIgnoreCase(choice)){
            System.out.println("Please enter the temperature in Fahrenheit:");
            int temperatureInFahrenheit = 0;
            try {
                temperatureInFahrenheit = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You entered a non-numeric value!");
                System.exit(-1);
            }
            double temperatureInKelvin = (temperatureInFahrenheit + 459.67) * 5/9;
            System.out.println("The temperature in Kelvin from Fahrenheit is: " + temperatureInKelvin);

            //FK to convert from Kelvin to Fahrenheit
        } else if("FK".equalsIgnoreCase(choice)){
            System.out.println("Please enter the temperature in Kelvin:");
            double temperatureInKelvin = 0;
            try {
                temperatureInKelvin = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You entered a non-numeric value!");
                System.exit(-1);
            }
            double temperatureInFahrenheit= (temperatureInKelvin * 9/5)-459.67;
            System.out.println("The temperature in Fahrenheit from Kelvin is: " + temperatureInFahrenheit);

            //KC to convert from Celsius to Kelvin.
        }else if("KC".equalsIgnoreCase(choice)){
            System.out.println("Please enter the temperature in Celsius:");
            double temperatureInCelsius = 0;
            try {
                temperatureInCelsius = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You entered a non-numeric value!");
                System.exit(-1);
            }
            double temperatureInKelvin= temperatureInCelsius + 273.15;
            System.out.println("The temperature in Kelvin from Celsius: " + temperatureInKelvin);

            // CK to convert from Kelvin to Celsius
        }else if("CK".equalsIgnoreCase(choice)){
            System.out.println("Please enter the temperature in Kelvin:");
            double temperatureInKelvin = 0;
            try {
                temperatureInKelvin = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You entered a non-numeric value!");
                System.exit(-1);
            }
            double temperatureInCelsius= temperatureInKelvin - 273.15;
            System.out.println("The temperature in Celsius from Kelvin: " + temperatureInCelsius);
        }

    }
    }
