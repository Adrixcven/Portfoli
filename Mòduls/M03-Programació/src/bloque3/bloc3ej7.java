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
public class bloc3ej7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("introduce un numero nuevo");
        int numintroducido = in.nextInt(), numerospares = 0;
        while (numintroducido != 0) {
            if (numintroducido % 2 == 0) {
                numerospares++;
            } else {

            }
            System.out.println("introduce un numero nuevo");
            numintroducido = in.nextInt();
        }
        if (numintroducido == 0) {
            System.out.println("El numero es 0 y han introducido " + numerospares + " pares");
        } else {

        }
    }
}
