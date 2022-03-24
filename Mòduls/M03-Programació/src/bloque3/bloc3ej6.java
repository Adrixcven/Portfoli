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
public class bloc3ej6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = 0, numerosuma = 1;

        while (numerosuma <= 100) {
            numero = numero + numerosuma;
            numerosuma++;
            System.out.println("el numero es " + numero);
            System.out.println("-----");
        }
        System.out.println("el numero final es " + numero);
    }
}
