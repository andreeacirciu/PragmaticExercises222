package org.example.DataStructures;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeListRemoval {
    public static void main(String[] args) throws IOException {
            //constraints
//        boolean check;
//
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> employees = new ArrayList<>();
//        employees.add("John Smith");
//        employees.add("Jackie Jackson");
//        employees.add("Chris Jones");
//        employees.add("Amanda Cullen");
//        employees.add("Jeremy Goodwin");
//
//        for (String employee : employees) {
//            System.out.println(employee);
//        }
//        System.out.println("Enter an employee name to remove: ");
//        String name = scanner.nextLine();
//
//        check = employees.contains(name);
//
//            if (check) {
//                employees.remove(name);
//                for (String employee : employees) {
//                    System.out.println(employee);
//                }
//            } else {
//                System.out.println("The name doesn't exist in this list of employees!");
//            }


        ///////////////////////////////challenges
        // numele trebuie scris exact ca in lista


        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\00_Facultate\\Java15\\PragmaticExercises222\\src\\main\\java\\org\\example\\DataStructures\\emplyees.txt"));
        Scanner scanner = new Scanner(System.in);

        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("D:\\00_Facultate\\Java15\\PragmaticExercises222\\src\\main\\java\\org\\example\\DataStructures\\emplyees.txt", true));

        ArrayList<String> employees = new ArrayList<>();

        String names;
        System.out.println("Employees: ");
        while ((names = bufferedReader.readLine()) != null) {
            System.out.println(names);
            employees.add(names);
        }

        System.out.println("Enter an employee name to remove: ");
        String employeeToRemove = scanner.nextLine();

        String resultLine = "\n Employees (after removing): " + " \n";

        bufferedWriter.write(resultLine);

        if (employees.contains(employeeToRemove)) {
            employees.remove(employeeToRemove);
        } else {
            System.out.println("The name doesn't exist in this list of employees!");
        }

        for (String s : employees) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }

        scanner.close();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
