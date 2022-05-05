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
public class algoritmos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Cuantos numeros quieres?");
        int numElements = in.nextInt();
        int[] primers = new int[numElements];
        primers = hacerArray(numElements, in);
        ordenaSeleccio(primers);
        mostraVector(primers);
        System.out.println("Que numero quieres?");
        int busqueda = in.nextInt();
        busqueda1(primers, busqueda);
        busqueda2(primers, busqueda);
    }

    public static int[] hacerArray(int numElements, Scanner in) {
        int[] primers = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            primers[i] = (int)(Math.random()*10);
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
    }

    public static void busqueda1(int[] primers, int busqueda) {
        int i = 0;
        for (i = 0; i < primers.length; i++) {
            if (primers[i] == busqueda) {
                System.out.println("Existe, esta en la posicion " + i + " del array");
                break;
            }
        }
        if(primers[i] != busqueda){
            System.out.println("No esta");
        }
    }

    public static void busqueda2(int[] primers, int busqueda) {
        int low = 0, max = primers.length -1, medio = 0;
        while (low <= max) {
            medio = low + (max - low) / 2;
            if (primers[medio] == busqueda){
                System.out.println("El numero esta en la posicion " + medio);
                break;
            }
            if (primers[medio]< busqueda){
                low = medio+1;
            } else{
                max = medio-1;
            }
        }
        if(primers[medio] != busqueda){
            System.out.println("No esta");
        }
    }
}
