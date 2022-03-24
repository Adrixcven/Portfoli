/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloque3;

import java.util.Scanner;

/**
 *
 * @author Adrix
 */
public class bloc3ej5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("introduce un numero nuevo");
        int numero, tabla, resultat;
        for (numero = 2; numero <= 10; numero++) {
            for (tabla = 1; tabla <= 10; tabla++) {
                resultat = numero * tabla;
                System.out.println(numero + " por " + tabla + " nos da " + resultat);
            }
        }
    }
}
