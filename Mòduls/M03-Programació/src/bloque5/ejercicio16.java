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
public class ejercicio16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float[] numero = new float[20];
        int positivos = 0, negativos = 0, cero = 0;
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Añade un numero");
            numero[i] = in.nextFloat();
            if (numero[i] == 0) {
                cero++;
            } else if (numero[i] % 2 == 0) {
                positivos++;
            } else if (numero[i] % 2 == 1) {
                negativos++;
            }
            System.out.println(numero[i]);
        }
        System.out.println("hay " + positivos + " positivos, " + negativos + " negativos y " + cero + " ceros.");
    }
}
