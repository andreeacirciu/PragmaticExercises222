package org.example.inputprocessingoutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingQuotes {
    public static void main(String[] args) {
        //constraints
        System.out.println("Wht is the quote?");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println("Who said it?");
        String inputString2 =scanner.nextLine();

        System.out.println(inputString2 + " says, " + "\"" + inputString + "\"" );

        //challenges soon
    }
}
