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
public class bloc3ej22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame el numero");
        String cadena = in.nextLine();
        boolean arroba = false;
        int i = 0;

        int longitud = cadena.length();

        while ((i < longitud) && (arroba == false)) {
            if (cadena.charAt(i) == '@') {
                arroba = true;
            }
            i++;
        }

        if (arroba == true) {
            System.out.println("Tiene un arroba");
        } else {
            System.out.println("No tiene un arroba");
        }
    }
}
