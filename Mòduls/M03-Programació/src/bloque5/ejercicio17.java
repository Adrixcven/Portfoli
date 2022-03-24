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
public class ejercicio17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numero = new int[20];
        int max = 0, minimo = 1;
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Añade un numero");
            numero[i] = in.nextInt();
            if (numero[i] > i) {
                System.out.println("El numero " + numero[i] + " es mas grande que su posicion");
            }
        }

    }
}
