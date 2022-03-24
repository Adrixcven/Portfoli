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
public class bloc3ej20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame la m");
        int m = in.nextInt();
        System.out.println("Dame la n");
        int n = in.nextInt();
        int resultat=1;
        for (int y = 0; y < n; y++) {
            resultat = resultat * m;
        }
        System.out.println("El resultado es " + resultat);
    }
}
