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
public class bloc3ej19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame una frase");
        String nombre = in.nextLine();

        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int y = nombre.length() - 1; y >= 0; y--) {
            char carac = nombre.charAt(y);
            switch (carac) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("hay " + a + " a, " + e + " e, " + i + " i, " + o + " o y " + u + " u.");
    }
}
