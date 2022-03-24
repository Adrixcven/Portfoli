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
public class bloc3ej16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame una frase");
        String nombre = in.nextLine();
        for (int i = nombre.length() - 1; i >= 0; i--) {
            System.out.print(nombre.charAt(i));
        }
        System.out.println("");
    }
}
