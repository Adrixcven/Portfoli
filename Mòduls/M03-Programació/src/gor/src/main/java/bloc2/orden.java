/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloc2;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Adrix
 */
public class orden {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Cuantos elementos?");
        int numElements = in.nextInt();
        int[] primers = new int[numElements];
        primers = generaVector(numElements, in);
        mostraVector(primers);
        ordenaBombolla(primers);
        ordenaSeleccio(primers);
        generaVecto(primers);
    }

    public static int[] generaVector(int numElements, Scanner in) {
        int[] primers = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            System.out.println("Que numero?");
            primers[i] = in.nextInt();
        }
        return primers;
    }

    public static void mostraVector(int[] primers) {
        for (int i = 0; i < primers.length; i++) {
            System.out.print(primers[i] + ", ");
        }
        System.out.println("");
    }

    public static void ordenaSeleccio(int[] primers) {
        for (int i = 0; i < primers.length - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < primers.length; j++) {
                if (primers[j] < primers[minimo]) {
                    minimo = j;
                }
            }
            int swap = primers[i];
            primers[i] = primers[minimo];
            primers[minimo] = swap;

        }
        mostraVector(primers);
    }

    public static void ordenaBombolla(int[] primers) {
        int aux;
        for (int i = 0; i < primers.length - 1; i++) {
            for (int j = 0; j < primers.length - i - 1; j++) {
                if (primers[j + 1] < primers[j]) {
                    aux = primers[j + 1];
                    primers[j + 1] = primers[j];
                    primers[j] = aux;
                }
            }
        }
        mostraVector(primers);
    }
    public static void generaVecto(int[] primers) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < primers.length; i++) {
            al.add(primers[i]);
        }
        Collections.sort(al);
        System.out.println(al);
    }
}
