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
public class ejercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float[] inventari = new float[100];
        for (int i = 0; i < inventari.length; i++) {
            inventari[i] = i;
            if (inventari[i] % 3 == 0) {
                System.out.println(inventari[i] + " es multiplo de 3");
            }
        }
    }
}
