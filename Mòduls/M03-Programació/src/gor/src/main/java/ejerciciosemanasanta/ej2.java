/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosemanasanta;

import java.util.*;
import java.util.Scanner;

public class ej2 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int valor = in.nextInt();
        float numeros[] = generaVecto(valor, in);
        ordenaseleccio(numeros);
    }

    public static float[] generaVecto(int valor, Scanner in) {
        float temp = 0;
        float[] numeros = new float[valor];
        for (int i = 0; i < numeros.length; i++) {
            temp = in.nextFloat();
            numeros[i] = temp;

        }
        return numeros;
    }

    public static void mostraVecto(float[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
    }

    public static void ordenaseleccio(float[] numeros) {
        float aux;
        int count = 0;
        for (int i = 0; i < numeros.length; i++) {
            int minimo = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[minimo]) {
                    minimo = j;
                }
                count++;
            }
            aux = numeros[i];
            numeros[i] = numeros[minimo];
            numeros[minimo] = aux;
        }
        mostraVecto(numeros);
        System.out.println("Total passades: " + count);
    }
}