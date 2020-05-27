package org.example.DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("What's your question?");
        String question = scanner.nextLine();

        int randomNumber = random.nextInt(4);

        Map<Integer, String> answers = new HashMap<>();
        answers.put(1, "Yes");
        answers.put(2, "No");
        answers.put(3, "Maybe");
        answers.put(4, "Ask again later.");

        for (Map.Entry<Integer, String> entry : answers.entrySet()){
            if(randomNumber == entry.getKey()){
                System.out.println(entry.getValue());
            }
        }

    }
}
