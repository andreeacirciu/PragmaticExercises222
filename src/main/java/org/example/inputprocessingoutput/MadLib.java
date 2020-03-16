package org.example.inputprocessingoutput;

import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        //constraints
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("Enter a noun: ");
//        String noun = scanner.nextLine();
//        System.out.println("Enter a verb: ");
//        String verb = scanner.nextLine();
//        System.out.println("Enter an adjective: ");
//        String adjective = scanner.nextLine();
//        System.out.println("Enter a adverb: ");
//        String adverb = scanner.nextLine();
//
//        String outputString = String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
//        System.out.println(outputString);

        //challenges
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a noun: ");
        String noun = scanner.nextLine();
        System.out.println("Enter a verb: ");
        String verb = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        String adjective = scanner.nextLine();
        System.out.println("Enter a adverb: ");
        String adverb = scanner.nextLine();
        System.out.println("Enter a name: ");
        String name = scanner.nextLine();

        String outputString = String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
        System.out.println(outputString);
        String outputString2 = String.format("What's the name of your %s?\n Its name is %s.", noun, name);
        System.out.println(outputString2);

        switch (name) {
            case "Jack":
                System.out.println("It is a pirate name! :) ");
                break;
            case "Rex":
                System.out.println("It is a very common name!");
                break;
            case "Kitty":
                System.out.println("It is a perfect name for a cat.");
                break;
        }
        System.out.println("It is a beautiful name!");


    }
}
