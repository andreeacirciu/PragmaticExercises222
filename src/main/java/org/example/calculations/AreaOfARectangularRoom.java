package org.example.calculations;

import java.util.Scanner;

public class AreaOfARectangularRoom {
    public static void main(String[] args) {
        final double conversionFactor = 0.09290304;
        //constraints
//     Scanner scanner = new Scanner(System.in);
//     System.out.println("What is the length of the room in feet?");
//     int roomLength = scanner.nextInt();
//     System.out.println("What is the width of the room in feet?");
//     int roomWidth = scanner.nextInt();
//     String enteredDimensions = String.format("You entered dimensions of %d feet by %d feet.", roomLength, roomWidth);
//        System.out.println(enteredDimensions);
//
//     int areaFeet = roomLength * roomWidth;
//     float areaMeters = (float)(areaFeet * conversionFactor);
//
//     String area = String.format("The area is \n%d square feet \n%f square meters", areaFeet, areaMeters);
//        System.out.println(area);

        //challenges
        System.out.println("If you want to find out the area of your rectangular room you have to choose the unit measurement: feet or meters?");
        Scanner scanner = new Scanner(System.in);
        String unitMeasurement = scanner.nextLine();

        switch (unitMeasurement) {
            case "feet":
                System.out.println("What is the length of the room in feet?");
                double roomLength = scanner.nextDouble();
                System.out.println("What is the width of the room in feet?");
                double roomWidth = scanner.nextDouble();

                String enteredDimensionsFeet = String.format("You entered dimensions of %f feet by %f feet.", roomLength, roomWidth);
                System.out.println(enteredDimensionsFeet);

                double areaFeet = roomLength * roomWidth;
                float areaMeters = (float)(areaFeet * conversionFactor);
                String area1 = String.format("The area is \n%.0f square feet \n%f square meters", areaFeet, areaMeters);
                System.out.println(area1);
                break;

            case "meters":
                System.out.println("What is the length of the room in meters?");
                double roomLengthMeters = scanner.nextDouble();
                System.out.println("What is the width of the room in meters?");
                double roomWidthMeters = scanner.nextDouble();

                String enteredDimensionsMeters = String.format("You entered dimensions of %f meters by %f meters.", roomLengthMeters, roomWidthMeters);
                System.out.println(enteredDimensionsMeters);

                double areaMeters2 = roomLengthMeters * roomWidthMeters;
                float areaFeet2 = (float) (areaMeters2 / conversionFactor);

                String area2 = String.format("The area is \n%.0f square feet \n%f square meters", areaFeet2, areaMeters2);
                System.out.println(area2);
                break;
            default:
                System.out.println("You entered something wrong!");

        }
    }
}
