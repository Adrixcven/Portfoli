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
public class bloc3ej17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame una frase");
        String nombre = in.nextLine();
        int a = 0;
        for (int i = nombre.length()-1; i >= 0; i--) {
            if (nombre.charAt(i) == 'a'){
                a++;
            }
        }
        System.out.println(a);
    }
}
