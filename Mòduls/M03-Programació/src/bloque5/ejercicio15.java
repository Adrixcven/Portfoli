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
public class ejercicio15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numero = new int[20];
        int max = 0, minimo = 0;
        for (int i = 0; i < numero.length; i++) {
            while (true) {
                if ((minimo % 2 == 0) && (minimo > max)) {
                    numero[i] = minimo;
                    break;
                } else {
                    minimo++;
                }
            }
            minimo++;
            System.out.println(numero[i]);
        }

    }
}
