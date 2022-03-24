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
public class ejercicio18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numero = new int[30];
        int aprobado = 0;
        float porcentaje = 0;
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Añade un numero");
            numero[i] = in.nextInt();
            if (numero[i] >= 5) {
                aprobado++;
            }
        }
        porcentaje = ((float) aprobado / numero.length) * 100;
        System.out.println("El porcentaje de aprobados es " + porcentaje + "%");

    }
}
