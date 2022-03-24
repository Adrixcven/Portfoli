/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1;

import java.util.Scanner;

/**
 *
 * @author Adrix
 */
public class ej3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner ine = new Scanner(System.in);
//        Para empezar, crearemos el String con el numero inicial y los char de cada numero.
        System.out.println("Introduce un numero de 8 cifras");
        String numero = in.nextLine();
        char numero1 = 0, numero2 = 0, numero3 = 0, numero4 = 0, numero5 = 0, numero6 = 0, numero7 = 0, numero8 = 0;
//      cada caracter del string, lo guardaremos en un char diferente.
        numero1 = numero.charAt(0);
        numero2 = numero.charAt(1);
        numero3 = numero.charAt(2);
        numero4 = numero.charAt(3);
        numero5 = numero.charAt(4);
        numero6 = numero.charAt(5);
        numero7 = numero.charAt(6);
        numero8 = numero.charAt(7);
        //A continuacion, los chars los pasaremos de nuevo a string, ademas de agregar los srings de 2 en 2.
        String numer1 = numero1 + "";
        String numer2 = numero2 + "";
        String numer3 = numero3 + "";
        String numer4 = numero4 + "";
        String numer5 = numero5 + "";
        String numer6 = numero6 + "";
        String numer7 = numero7 + "";
        String numer8 = numero8 + "";
        String numer12 = numer1 + numer2;
        String numer34 = numer3 + numer4;
        String numer56 = numer5 + numer6;
        String numer78 = numer7 + numer8;
        //una vez hecho strings, todos los numeros los pasaremos a int y haremos las sumas.
        int number1 = Integer.parseInt(numer1);
        int number2 = Integer.parseInt(numer2);
        int number3 = Integer.parseInt(numer3);
        int number4 = Integer.parseInt(numer4);
        int number5 = Integer.parseInt(numer5);
        int number6 = Integer.parseInt(numer6);
        int number7 = Integer.parseInt(numer7);
        int number8 = Integer.parseInt(numer8);
        int number12 = Integer.parseInt(numer12);
        int number34 = Integer.parseInt(numer34);
        int number56 = Integer.parseInt(numer56);
        int number78 = Integer.parseInt(numer78);
        int total1 = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8;
        int total2 = number12 + number34 + number56 + number78;
        System.out.println("Las soluciones son: para sumar cada cifra = " + total1 + " y para sumar las cifras de 2 en 2 = " + total2);

    }
}
