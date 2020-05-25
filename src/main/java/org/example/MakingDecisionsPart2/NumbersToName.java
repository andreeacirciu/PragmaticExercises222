package org.example.MakingDecisionsPart2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumbersToName {
    public static void main(String[] args) {
        //constraints
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the number of the month: ");
//        int numberMonth = scanner.nextInt();
//
//        switch (numberMonth){
//            case 1:
//                System.out.println("The name of the month is January.");
//                break;
//            case 2:
//                System.out.println("The name of the month is February.");
//                break;
//            case 3:
//                System.out.println("The name of the month is March.");
//                break;
//            case 4:
//                System.out.println("The name of the month is April.");
//                break;
//            case 5:
//                System.out.println("The name of the month is May.");
//                break;
//            case 6:
//                System.out.println("The name of the month is June.");
//                break;
//            case 7:
//                System.out.println("The name of the month is July.");
//                break;
//            case 8:
//                System.out.println("The name of the month is August.");
//                break;
//            case 9:
//                System.out.println("The name of the month is September.");
//                break;
//            case 10:
//                System.out.println("The name of the month is October.");
//                break;
//            case 11:
//                System.out.println("The name of the month is November.");
//                break;
//            case 12:
//                System.out.println("The name of the month is December.");
//                break;
//            default:
//                System.out.println("Please enter numbers from 1 to 12!");
//        }

        //challenges
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a language between English and Romanian/Alege o limba dintre engleza si romana(EN/RO)");
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("EN")){

        Map<Integer, String> monthsEN = new HashMap<>();
        monthsEN.put(1,"January");
        monthsEN.put(2,"February");
        monthsEN.put(3,"March");
        monthsEN.put(4,"April");
        monthsEN.put(5,"May");
        monthsEN.put(6,"June");
        monthsEN.put(7,"July");
        monthsEN.put(8,"August");
        monthsEN.put(9,"September");
        monthsEN.put(10,"October");
        monthsEN.put(11,"November");
        monthsEN.put(12,"December");


        System.out.println("Please enter the number of the month(1-12): ");
        int numberMonth = scanner.nextInt();
        for(Map.Entry<Integer, String> entry : monthsEN.entrySet()) {
            if (numberMonth == entry.getKey()) {
                System.out.println("The name of the month is " + entry.getValue());
            }
        }
    } else if(answer.equalsIgnoreCase("RO")){
            Map<Integer, String> monthsRO = new HashMap<>();
            monthsRO.put(1,"Ianuarie");
            monthsRO.put(2,"Februarie");
            monthsRO.put(3,"Martie");
            monthsRO.put(4,"Aprilie");
            monthsRO.put(5,"Mai");
            monthsRO.put(6,"Iunie");
            monthsRO.put(7,"Iunlie");
            monthsRO.put(8,"August");
            monthsRO.put(9,"Septembrie");
            monthsRO.put(10,"Octombrie");
            monthsRO.put(11,"Noiembrie");
            monthsRO.put(12,"Decembrie");


            System.out.println("Te rog sa introduci numarul lunii: ");
            int numberMonth = scanner.nextInt();
            for(Map.Entry<Integer, String> entry : monthsRO.entrySet()) {
                if (numberMonth == entry.getKey()) {
                    System.out.println("Numele lunii este " + entry.getValue());
                }
            }
        }
    }
}
