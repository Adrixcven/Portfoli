/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloque4;

import java.util.Scanner;

/**
 *
 * @author Adrix
 */
public class ejercicio8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame un numero");
        int numero = in.nextInt(), suma = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma = suma + i;
            }
            System.out.println(suma);
        }
        if (numero == suma) {
            System.out.println("Tu numero es perfecto");
        } else {
            System.out.println("Tu numero es imperfecto");
        }
    }
}
