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
public class bloc3ej18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame una frase");
        String nombre = in.nextLine();
        System.out.println("Dame una frase");
        String letra = in.nextLine();
        int a = 0;
        for (int i = nombre.length() - 1; i >= 0; i--) {
            char carac = nombre.charAt(i);
            char letras = letra.charAt(0);
            if (carac == letras) {
                a++;
            }
        }
        System.out.println(a);
    }
}
