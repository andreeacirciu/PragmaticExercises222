package org.example.calculations;


import java.util.Scanner;

public class SelfCheckout {
    public static void main(String[] args) {
        //constraints
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price of item 1: ");
        int price1 = scanner.nextInt();
        System.out.println("Enter the quantity of item 1: ");
        int quantity1 = scanner.nextInt();

        System.out.println("Enter the price of item 2: ");
        int price2 = scanner.nextInt();
        System.out.println("Enter the quantity of item 2: ");
        int quantity2 = scanner.nextInt();

        System.out.println("Enter the price of item 3: ");
        int price3 = scanner.nextInt();
        System.out.println("Enter the quantity of item 3: ");
        int quantity3 = scanner.nextInt();

        double subtotal = price1 * quantity1 + price2 * quantity2 + price3 * quantity3;
        double tax = subtotal * 0.055;
        double total = subtotal + tax;
        String output = String.format("Subtotal: $%.2f \nTax: $%.2f \nTotal: $%.2f", subtotal, tax, total);
        System.out.println(output);

    }
}