package org.example.DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ComputingStatistic {
    public static void main(String[] args) {
        int sum = 0;
        double average = 0;
        int minimum;
        int maximum;
        String number;

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<Integer> numbersInt = new ArrayList<>();

        do {
            System.out.println("Enter a number: ");
            number = scanner.next();
            scanner.nextLine();
            numbers.add(number);
        } while (!number.equals("done"));
        numbers.remove("done");


        System.out.println("Numbers: ");
        for (String s : numbers) {
            System.out.println(s);
            numbersInt.add(Integer.parseInt(s));
        }

        //System.out.println(numbers.size());

        for (int i = 0; i<numbersInt.size(); i++) {
            sum = sum + numbersInt.get(i);
            average = (double) sum / numbersInt.size();
        }

           maximum = Collections.max(numbersInt);
           minimum = Collections.min(numbersInt);

        System.out.println("The average is: " + average);
        System.out.println("The minimum is: " + minimum);
       System.out.println("The maximum is:" + maximum);

    }
}
