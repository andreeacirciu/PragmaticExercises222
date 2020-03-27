package org.example.calculations;

import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {
//        //constraints
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many people?");
//        int people = scanner.nextInt();
//        System.out.println("How many pizza do you have?");
//        int pizzas= scanner.nextInt();
//        System.out.println("How many slices per pizza?");
//        int slices = scanner.nextInt();
//        int totalPizzaSlices = pizzas * slices;
//        if(totalPizzaSlices < people)
//        {
//            String outputString3= String.format("You should buy more pizza because it's not enough for %d people.", people);
//            System.out.println(outputString3);
//            System.exit(0);
//        }
//
//        int pizzaSlicesForEachPerson = totalPizzaSlices / people;
//        double leftOverPieces = totalPizzaSlices % people;
//
//
//        String outputString = String.format("%d people with %d pizzas. \nEach person gets %d pieces of pizza.", people, pizzas, pizzaSlicesForEachPerson);
//        String outputString2 =String.format("There are %.0f leftover pieces.", leftOverPieces);
//        System.out.println(outputString);
//        System.out.println(outputString2);

        //////challenges pluralization

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many people?");
//        int people = scanner.nextInt();
//        System.out.println("How many pizza do you have?");
//        int pizzas= scanner.nextInt();
//        System.out.println("How many slices per pizza?");
//        int slices = scanner.nextInt();
//        int totalPizzaSlices = pizzas * slices;
//        if(totalPizzaSlices < people)
//        {
//            String outputString3 = String.format("You should buy more pizza because it's not enough for %d people.", people);
//            System.out.println(outputString3);
//            System.exit(0);
//        }
//
//        int pizzaSlicesForEachPerson = totalPizzaSlices / people;
//        String outputString = String.format("%d people with %d pizzas. ", people, pizzas);
//        System.out.println(outputString);
//
//        int leftOverPieces = totalPizzaSlices % people;
//        String outputPluralization;
//        if (pizzaSlicesForEachPerson == 1) {
//            outputPluralization = String.format("Each person gets %d piece of pizza.", pizzaSlicesForEachPerson);
//        }
//        else {
//            outputPluralization = String.format("Each person gets %d pieces of pizza.", pizzaSlicesForEachPerson);
//        }
//        System.out.println(outputPluralization);
//
//        String outputString2 =String.format("There are %d leftover pieces.", leftOverPieces);
//        System.out.println(outputString2);

        //////challenges ultima bulina
        float slices = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people?");
        int numberOfPeople = scanner.nextInt();
        int[] people = new int[numberOfPeople];
        for(int i=1; i<=people.length; i++){
            String output1 = String.format("How many slices of pizza wants person number %d: ", i);
            System.out.println(output1);
            float slicesPerPerson = scanner.nextInt();
            slices = slices + slicesPerPerson;
        }

        System.out.println("How many slices have the pizza you want to order?");
        int slicesPerPizza = scanner.nextInt();
        float pizzas = slices / slicesPerPizza;
        pizzas = (float) Math.ceil(pizzas); //for round up number of pizzas
        String output2 = String.format("You will need to buy %d pizzas for %d people.", (int) pizzas, people.length);
        System.out.println(output2);
    }
}
