package org.example.MakingDecisionsPart2;

import java.util.Scanner;

public class TroubleshootingCarIssues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Is the car silent when you turn the key?");
        String answer1 = scanner.nextLine();
        if (answer1.equalsIgnoreCase("y")) {
            System.out.println("Are the battery terminals corroded?");
            String answer2 = scanner.nextLine();
            if (answer2.equalsIgnoreCase("y")) {
                System.out.println("Clean terminals and try starting again.");
            } else if (answer2.equalsIgnoreCase("n")) {
                System.out.println("Replace cables and try again.");
            }
        } else if (answer1.equalsIgnoreCase("n")) {
            System.out.println("Does the car make a clicking noise?");
            String answer3= scanner.nextLine();
            if(answer3.equalsIgnoreCase("y")){
                System.out.println("Replace the battery.");
            }else if(answer3.equalsIgnoreCase("n")){
                System.out.println("Does the car crank up but fail to start?");
                String answer4= scanner.nextLine();
                if(answer4.equalsIgnoreCase("y")){
                    System.out.println("Check spark plug connections.");
                }else if(answer4.equalsIgnoreCase("n")){
                    System.out.println("Does the engine start and then die?");
                    String answer5= scanner.nextLine();
                    if(answer5.equalsIgnoreCase("y")){
                        System.out.println("Does your car have fuel injection?");
                        String answer6=scanner.nextLine();
                        if (answer6.equalsIgnoreCase("y")){
                            System.out.println("Get it for service.");
                        }else if(answer6.equalsIgnoreCase("n")){
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                }
            }
        }
    }
}
