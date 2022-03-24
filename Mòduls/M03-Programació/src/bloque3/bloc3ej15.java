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
public class bloc3ej15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        String nombre = in.nextLine();
        System.out.println("Hola " + nombre);
        System.out.println("La longitut es " + nombre.length());
        System.out.println("La 3 letra es " + nombre.substring(2, 3));
        System.out.println("Dame otra string");
        String nombre2 = in.nextLine();
        if (nombre.equals(nombre2)) {
            System.out.println("Las strings son iguales");
        } else {
            System.out.println("Las strings no son iguales");
        }
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre2.toLowerCase());
    }
}
