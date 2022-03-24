package Bloc2;

import java.util.Scanner;

public class Bloc2_2 {

    public static void main(String[] args) {

        Scanner inStr = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);

        String[] plats = new String[5];

        for (int i = 0; i < plats.length; i++) {
            plats[i] = inStr.nextLine();
        }

        int[] servits = new int[5];
        for (int i = 0; i < plats.length; i++) {
            System.out.print(plats[i] + ": ");
            servits[i] = inNum.nextInt();
        }
        int max = 0, min = 0, sum = 0;
        for (int i = 0; i < plats.length; i++) {
            if (i == 0) {
                max = i;
                min = i;
            } else {

                if (servits[i] > servits[max]) {
                    max = i;
                }
                if (servits[i] < servits[min]) {
                    min = i;
                }

                sum = sum + servits[i];
            }

        }

        System.out.println("El plat més servit és " + plats[max]);
        System.out.println("S'han servit " + servits[max] + " plats");

        System.out.println("El plat menys servit és " + plats[min]);
        System.out.println("S'han servit " + servits[min] + " plats");

        System.out.println("S'ahn servit " + sum + " plats");

        float percentatge = (float) servits[max] / sum * 100;

    }
}
