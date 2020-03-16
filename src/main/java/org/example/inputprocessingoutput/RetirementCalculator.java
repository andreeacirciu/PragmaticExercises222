package org.example.inputprocessingoutput;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class RetirementCalculator {
    public static void main(String[] args) {
         //constraints + challenge
        System.out.println("What is your current age?");
        Scanner scanner =new Scanner(System.in);
        int currentAge = scanner.nextInt();

        System.out.println("At what age would you like to retire?");
        int retirementAge = scanner.nextInt();

        int yearsLeft = retirementAge - currentAge;
        if(yearsLeft < 0)
        {
            System.out.println("You had to be already retired!");
        }
           else{
        String outputString = String.format("You have %d years left until you can retire.\n", yearsLeft);
        System.out.println(outputString);

        Date currentDate = new Date();
        LocalDate localDate = currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        int yearOfRetirement =localDate.getYear() + yearsLeft;
        System.out.println("It's " + localDate.getYear() + ", so you can retire in " + yearOfRetirement);
           }
    }
}
