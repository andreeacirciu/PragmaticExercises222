package org.example.DataStructures;

import java.util.*;

public class PickingAWinner {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //am incercat doua variante
        //////aici cu map

//        Map<Integer, String> answers = new HashMap<>();
//
//        int i = 0;
//        String name;
//        do {
//            System.out.println("Enter a name: ");
//            name = scanner.nextLine();
//            answers.put(i, name);
//            i++;
//        }while (!name.contains(" "));
//
//
//        //System.out.println("i="+ (i-1));
//
//        int randomNumber = random.nextInt(i-1); //i-1 ca sa nu se adauge in lista si spatiul introdus la final
//
//        for (Map.Entry<Integer, String> entry : answers.entrySet()) {
//            if (randomNumber == entry.getKey()) {
//                System.out.println(entry.getValue());
//            }
//        }

        //////aici cu array list

        ArrayList<String> names = new ArrayList<>();
        String name;
        do {
            System.out.println("Enter a name: ");
            name = scanner.nextLine();
            names.add(name);
        }while (!name.contains(" "));

        String s = names.get(random.nextInt(names.size()-1)); //names.size()-1 ca sa nu ia in considerarea si spatiul introdus la final
       // System.out.println(names.size()-1); //am verificat daca e ok size-ul
        System.out.println(s);
    }
}