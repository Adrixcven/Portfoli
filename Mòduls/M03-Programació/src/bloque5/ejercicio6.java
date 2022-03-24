/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloque5;

import java.util.Scanner;

/**
 *
 * @author Adrix
 */
public class ejercicio6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] inventari = new int[5];
        int suma = 0, contador = 0, minimo = 0;
        float mediana = 0;
        for (int i = 0; i < inventari.length; i++) {
            System.out.println("Pon un numero");
            inventari[i] = in.nextInt();
            if (minimo == 0) {
                minimo = inventari[i];
            }
            if (inventari[i] <= 25) {
                contador++;
                suma = suma + inventari[i];
                if (inventari[i] <= minimo) {
                    minimo = inventari[i];
                }
            }
        }
        mediana = (float) suma / inventari.length;
        System.out.println("La mediana de los menores de 25 es " + mediana);
        System.out.println("Hay " + contador + " numeros menores o iguales a 25");
        System.out.println("El numero mas pequeño es " + minimo);

    }
}
