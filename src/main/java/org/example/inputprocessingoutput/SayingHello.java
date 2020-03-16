package org.example.inputprocessingoutput;

import java.util.Scanner;

public class SayingHello {
    public static void main(String[] args) {

        //constraints
//        System.out.println("What's your name?");
//        Scanner scanner = new Scanner(System.in);
//        String yourName = scanner.nextLine();
//        System.out.println("Hello, " + yourName + ", nice to meet you!");

        //challenges
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String yourName = scanner.nextLine();

        switch (yourName) {
            case "Dan":
                System.out.println("Hello, Dan, nice to meet you!");
                break;
            case "Brian":
                System.out.println("Hello, Brian, nice to meet you!");
                break;
            case "Mark":
                System.out.println("Hello, Mark, nice to meet you!");
                break;
            default:
                System.out.println("Hello!");
                break;
        }
        }
        }
