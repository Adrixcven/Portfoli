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
public class ejercicioprueba {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame los nombres");
        String nombre = in.nextLine();
        char caracter;
        boolean esEva = false;
        int i;
        for (i = 0; i < nombre.length(); i++) {
            if ((nombre.charAt(i) == 'e') && (nombre.charAt(i + 1) == 'v') && (nombre.charAt(i + 2) == 'a')) {

                if (i == 0 && (nombre.charAt(i + 3) == ' ')) {
                    esEva = true;
                } else if ((i == nombre.length() - 3) && nombre.charAt(i - 1) == ' ') {
                    esEva = true;
                } else if ((nombre.charAt(i - 1) == ' ') && (nombre.charAt(i + 3) == ' ')) {
                    esEva = true;
                }
                if (esEva == true) {
                    char carac = Character.toUpperCase(nombre.charAt(i));
                    nombre = nombre.substring(0, i) + carac + nombre.substring(i + 1);
                    esEva = false;
                }
            }
        }

        System.out.println(nombre);
    }
}
