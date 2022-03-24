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
public class bloc3ej21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame el numero");
        String cadena = in.nextLine();
        boolean palindrom = true;
        int i = 0, j;

        cadena = cadena.toLowerCase();

        int longitud = cadena.length();
        j = longitud - 1;

        while ((i < j) && (palindrom == true)) {
            if (cadena.charAt(i) == ' ') {
                i++;
            }
            if (cadena.charAt(j) == ' ') {
                j--;
            }
            if (cadena.charAt(i) != cadena.charAt(j)) {
                palindrom = false;
            }
            i++;
            j--;
        }

        if (palindrom == true) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }
}
