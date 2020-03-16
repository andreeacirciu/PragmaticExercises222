package org.example.inputprocessingoutput;

import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {
        //constraints
//        System.out.println("What is the first number?");
//        Scanner scanner =new Scanner(System.in);
//        String number1 = scanner.nextLine();
//        System.out.println("What is the second number?");
//        String number2 = scanner.nextLine();
//
//        int firstNumber = Integer.parseInt(number1);
//        int secondNumber = Integer.parseInt(number2);
//
//
//        int sum = firstNumber +secondNumber;
//        int subtraction = firstNumber - secondNumber;
//        int multiplication  = firstNumber * secondNumber;
//        int division = firstNumber / secondNumber;
//
//        String outputString = String.format("%d + %d = %d \n%d - %d = %d \n%d + %d = %d \n%d + %d = %d", firstNumber, secondNumber, sum,
//                firstNumber, secondNumber, subtraction, firstNumber, secondNumber, multiplication, firstNumber, secondNumber, division);
//        System.out.println(outputString);


        //challenges fara functii
//        System.out.println("What is the first number?");
//        Scanner scanner = new Scanner(System.in);
//        int firstNumber = scanner.nextInt();
//        while(firstNumber < 0 ) {
//            System.out.println("You introduced a negative number! Try again!");
//            firstNumber = scanner.nextInt();
//        }
//
//        System.out.println("What is the second number?");
//        int secondNumber = scanner.nextInt();
//        while(secondNumber < 0) {
//            System.out.println("You introduced a negative number! Try again!");
//            secondNumber = scanner.nextInt();
//        }
//
//        int sum = firstNumber + secondNumber;
//        int subtraction = firstNumber - secondNumber;
//        int multiplication  = firstNumber * secondNumber;
//        int division = firstNumber / secondNumber;
//
//        String outputString = String.format("%d + %d = %d \n%d - %d = %d \n%d + %d = %d \n%d + %d = %d", firstNumber, secondNumber, sum,
//                firstNumber, secondNumber, subtraction, firstNumber, secondNumber, multiplication, firstNumber, secondNumber, division);
//        System.out.println(outputString);


        //challenges with functions(a treia cerinta de la challenges)
        System.out.println("What is the first number?");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        while(firstNumber < 0 ) {
            System.out.println("You introduced a negative number! Try again!");
            firstNumber = scanner.nextInt();
        }

        System.out.println("What is the second number?");
        int secondNumber = scanner.nextInt();
        while(secondNumber < 0) {
            System.out.println("You introduced a negative number! Try again!");
            secondNumber = scanner.nextInt();
        }

        Sum sum= new Sum();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        String outputString = String.format("%d + %d = %d \n%d - %d = %d \n%d * %d = %d \n%d / %d = %d", firstNumber, secondNumber, sum.sum(firstNumber, secondNumber),
                firstNumber, secondNumber, subtraction.subtraction(firstNumber, secondNumber), firstNumber, secondNumber, multiplication.multiplication(firstNumber, secondNumber), firstNumber, secondNumber,  division.division(firstNumber, secondNumber));
        System.out.println(outputString);
    }
}
