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
public class ejercicio7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] letras = new char[5];
        intro(letras);
        System.out.println("");

    }

    public static void esbrina(char[] cadena, String palabra) {
        boolean esPot, encontrada;
        char letra;
        System.out.println("introduce letras");

        esPot = true;
        for (int i = 0; i < palabra.length(); i++) {
            letra = palabra.charAt(i);
            encontrada = false;
            for (int j = 0; j < cadena.length; j++) {
                if (letra == cadena[j]) {
                    encontrada = true;
                }
            }
            if (encontrada == false) {
                esPot = false;
            }
        }
        if (esPot == false) {
            System.out.println("No es pot");
        } else {
            System.out.println("Si es pot");
        }
    }

    public static void intro(char[] letras) {
        Scanner in = new Scanner(System.in);
    }
}
//Hola
//Estamos en branch inicial