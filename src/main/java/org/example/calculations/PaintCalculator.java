package org.example.calculations;

import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        //constraints
        //number of gallons is round up
        float gallon = 1;
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);

//        System.out.println("What is the length of the room in feet?");
//        float roomLength = scanner.nextFloat();
//        System.out.println("What is the width of the room in feet?");
//        float roomWidth = scanner.nextFloat();
//        float areaFeet = roomLength * roomWidth;
//        float number = 0;
//
//        if(areaFeet <=350){
//            String output= String.format("You will need to purchase %.0f gallon of paint to cover %.2f square feet.", gallon, areaFeet);
//        System.out.println(output);
//    }
//        else if(areaFeet > 350 && areaFeet%350 != 0)
//        {
//            number = (int)(areaFeet/350);
//            gallon = gallon+number;
//        String output2= String.format("You will need to purchase %.0f gallon of paint to cover %.2f square feet.", gallon, areaFeet);
//        System.out.println(output2);
//        }

        //challenges round room
        System.out.println("What is the diameter of the round room in feet?");
        float diameter = scanner.nextFloat();
        float areaRoundRoom = (float) (PI * Math.pow(diameter/2, 2));
        float number;

        if(areaRoundRoom <=350){
            String output= String.format("You will need to purchase %.0f gallon of paint to cover %.2f square feet.", gallon, areaRoundRoom);
        System.out.println(output);
    }
        else if(areaRoundRoom > 350 && areaRoundRoom%350 != 0)
        {
            number = (int)(areaRoundRoom/350);
            gallon = gallon+number;
        String output2= String.format("You will need to purchase %.0f gallon of paint to cover %.2f square feet.", gallon, areaRoundRoom);
        System.out.println(output2);
        }

        //challenges L-shaped room
        /*
       */
    }
}
