/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasBloc3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Adrix
 */
public class tochararray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escribe una string");
        String uno = in.nextLine();
        char[] caracter = new char[uno.length()];
        caracter = uno.toCharArray();
        for (int i = 0; i < caracter.length; i++) {
            System.out.println("Caracter:" + caracter[i]);
        }

        String cadena = "adria;ferrer;si;ok";
        String[] cadenaStr = new String[4];
        cadenaStr = cadena.split(";");

        for (int i = 0; i < cadenaStr.length; i++) {
            System.out.println("Camps:" + cadenaStr[i]);
        }
        int[] arrInt = new int[]{2, 4, 6, 8, 0, 7, 5};
        int[] arrInt2 = Arrays.copyOf(arrInt, arrInt.length);

        for (int i = 0; i < arrInt2.length; i++) {
            System.out.println(" " + arrInt2[i]);
        }

        boolean retval = Arrays.equals(arrInt, arrInt2);
        System.out.println("arrInt y arrInt2 son " + retval);

        Arrays.fill(arrInt, 2, 4, 18);
        for (int value : arrInt) {
            System.out.println("Value = " + value);
        }

        int[] arrInt3 = new int[]{3, 2, 1, 5, 10};
        for (int number : arrInt3) {
            System.out.println("Number = " + number);
        }
        Arrays.sort(arrInt3, 0, 5);
        System.out.println("Ordenados:");
        for (int number : arrInt3) {
            System.out.println("Number = " + number);
        }
        
        System.out.println(Arrays.toString(arrInt3));
    }
}
