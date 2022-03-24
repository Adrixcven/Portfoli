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
public class bloc3ejA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el numero");
        int numero = in.nextInt(), factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial = (factorial * i) % 10;
        }
        System.out.println("el factorial de " + numero + " es " + factorial);
    }
}
