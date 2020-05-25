package org.example.Functions;

import java.util.Scanner;

public class ValidatingInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter the last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter the ZIP code: ");
        String zipCode = scanner.nextLine();

        System.out.println("Enter an employee ID: ");
        String employeeID = scanner.nextLine();

        validateInput(firstName, lastName, zipCode, employeeID);

    }

    static void validateInput(String firstName, String lastName, String zipCode, String employeeID) {

        int contor = 0;
        if (firstName.length() < 2) {
            System.out.println("\"" + firstName + "\" " + " is not a valid first name. It is too short.");
        }
        if (lastName.length() < 2) {
            System.out.println("\"" + lastName + "\" " + " is not a valid last name. It is too short.");
        }

        if (employeeID.length() < 7 ) {
            for (int i = 0; i < employeeID.length()-4; i++) {
                char x = employeeID.charAt(i);
                if (Character.isLetter(x)) {
                    contor++;
                }
            }
            for (int i = 3; i < employeeID.length(); i++) {
                char x = employeeID.charAt(i);
                if (Character.isDigit(x))
                    contor++;

            }

            if (employeeID.charAt(2) == '-') {
                contor++;
            }


            if(contor <6 ){
                System.out.println(employeeID + " is not a valid ID.");
            }
        } else {
            System.out.println(employeeID + " is not a valid ID.");
        }

        if(zipCode.matches("[1-9]+")){
            contor++;
        } else {
            System.out.println("The ZIP code must be numeric.");
        }

        if(contor == 7){
            System.out.println("There were no errors found.");
        }
    }

}
