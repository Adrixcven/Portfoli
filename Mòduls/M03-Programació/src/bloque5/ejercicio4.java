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
public class ejercicio4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] inventari = new int[20];
        int suma = 0;
        float mediana = 0;
        for (int i = 0; i < inventari.length; i++) {
            System.out.println("Pon la nota");
            inventari[i] = in.nextInt();
            suma = suma + inventari[i];
        }
        mediana = (float) suma / inventari.length;
        System.out.println("La mediana de notas es " + mediana);
    }
}
