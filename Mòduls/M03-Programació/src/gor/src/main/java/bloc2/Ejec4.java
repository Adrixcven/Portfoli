/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloc2;

import java.util.Scanner;

public class Ejec4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt(), nume = 0, nombre = 0;
        int[] primers = new int[numero];
        while (nume != numero) {
            nombre++;
            if (esNombrePrimer(nombre)) {
                primers[nume] = nombre;
                nume++;
            }
        }
        mostrarVector(primers);
    }

    public static boolean esNombrePrimer(int nombre) {
        int divisibles = 0;
        for (int i = 1; i <= nombre; i++) {
            if (nombre % i == 0) {
                divisibles++;
            }

        }
        if (divisibles == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void mostrarVector(int[] primers) {
        int contador = 0;
        for (int i = 0; i < primers.length; i++) {
            contador++;
            if (i == primers.length - 1) {
                System.out.print(primers[i] + ".");
            } else {
                System.out.print(primers[i] + ", ");
            }
            if(contador == 10){
                System.out.println("");
                contador = 0;
            }
        }
    }
}
