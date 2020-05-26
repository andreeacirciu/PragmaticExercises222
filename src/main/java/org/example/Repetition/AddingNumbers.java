package org.example.Repetition;


import java.util.Scanner;

public class AddingNumbers {
    public static void main(String[] args) {
        //constraints and challenges
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers you want to add?");
        int numbersToAdd = scanner.nextInt();

        int sum =0;

        for(int i =0; i <numbersToAdd; i++){
            System.out.println("Enter a number: ");
            String enteredNumber = scanner.next();
            scanner.nextLine();

            if(enteredNumber.matches("[0-9]+")){
                int number = Integer.parseInt(enteredNumber);
                sum= sum +number;
           }
        }
        System.out.println("The total is: " +sum);
    }
}
