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
public class ejToString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre = "1234";
        System.out.println("mida del string" + nombre.length());

        int valorEnter = Integer.parseInt(nombre);
        valorEnter += 12;
        int unEnter = 34;
        
        String unaCadena = Integer.toString(unEnter)
;
    }
}
