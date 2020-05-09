package org.example.MakingDecisions;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class LegalDrivingAge {
    public static void main(String[] args) {
        //constraints
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your age?");
//        int age = 0;
//        try {
//            age = scanner.nextInt();
//        } catch (InputMismatchException e) {
//            System.out.println("You introduced a non-numeric value!");
//        }
//
//        if(age >= 16){
//            System.out.println("You are old enough to legally drive.");
//        }else
//            System.out.println("You are not old enough to legally drive.");

        //challenges
        Map<String, Integer> countries = new HashMap<>();
        countries.put("Austria", 18);
        countries.put("Belgium", 18);
        countries.put("Bulgaria", 18);
        countries.put("Croatia", 18);
        countries.put("Cyprus", 17);
        countries.put("Czech Republic", 18);
        countries.put("Estonia", 18);
        countries.put("Finland", 18);
        countries.put("France", 18);
        countries.put("Germany", 18);
        countries.put("Gibraltar", 17);
        countries.put("Greece", 18);
        countries.put("Holland", 18);
        countries.put("Hungary", 17);
        countries.put("Ibiza", 18);
        countries.put("Canada", 16);
        countries.put("Australia", 16);
        countries.put("Fiji", 17);
        countries.put("New Zealand", 17);
        countries.put("Indonesia", 16);
        countries.put("Malaysia", 16);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = 0;
        try {
            age = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You introduced a non-numeric value!");
            System.exit(1);
        }

        System.out.println("You can legally drive in the countries shown below:");
       for (Map.Entry<String, Integer> entry : countries.entrySet()) {
            if (age == entry.getValue()) {
                System.out.println(entry.getKey());
            }
        }
    }
}
