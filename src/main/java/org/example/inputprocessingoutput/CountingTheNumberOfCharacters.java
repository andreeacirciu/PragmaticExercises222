package org.example.inputprocessingoutput;

import java.util.Scanner;

public class CountingTheNumberOfCharacters {
    public static void main(String[] args) {
        //constraints
//        System.out.println("What is the input string?");
//        Scanner scanner = new Scanner(System.in);
//        String inputString = scanner.nextLine();
//        System.out.println(inputString + " has " + inputString.length() + " characters.");

//        //challenges
        System.out.println("What is the input string?");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();


        while(inputString.length() == 0)
        {
            System.out.println("Enter a string!");
            inputString = scanner.nextLine();
        }
        System.out.println(inputString + " has " + inputString.length() + " characters.");

    }


}
