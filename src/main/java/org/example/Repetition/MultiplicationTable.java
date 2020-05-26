package org.example.Repetition;


public class MultiplicationTable {
    public static void main(String[] args) {
        //constraints
//        int a = 0;
//        while (a!= 13) {
//            for (int i = 0; i <= 12; i++) {
//                int multiplication = a * i;
//                System.out.println(a + "*" + i + "=" + multiplication);
//            }
//            a++;
//        }

        //challenges
                for (int i = 0; i <= 12; i++) {
                    for (int j = 0; j <= 12; j++) {
                        int multiplication = i * j;
                        System.out.printf("%4d", multiplication);
                    }
                    System.out.println();
                }

            }
        }

