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
public class ej2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner ine = new Scanner(System.in);
//        Primero crearemos la string para la cadena del dni y nos aseguraremos que elp usuario es mayor de edad.
        String cadenadni = "";
        System.out.println("Cual es tu edad?");
        int edad = in.nextInt();
        if (edad >= 18) {
//        Una vez confirmado el ser mayor de edad, mediremos el numero del dni y, usando la operacion numerodni % 23 calcularemos el resto.
//        Cuando tengamos el resto, dependiendo del resultado ira a un caso del Switch.
            System.out.println("Introduce tu numero de dni");
            int numerodni = in.nextInt();
            int calculoletra = numerodni % 23;
            switch (calculoletra) {
                case 0:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "T";
                    System.out.println(cadenadni);
                    break;
                case 1:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "R";
                    System.out.println(cadenadni);
                    break;
                case 2:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "W";
                    System.out.println(cadenadni);
                    break;
                case 3:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "A";
                    System.out.println(cadenadni);
                    break;
                case 4:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "G";
                    System.out.println(cadenadni);
                    break;
                case 5:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "M";
                    System.out.println(cadenadni);
                    break;
                case 6:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "Y";
                    System.out.println(cadenadni);
                    break;
                case 7:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "F";
                    System.out.println(cadenadni);
                    break;
                case 8:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "P";
                    System.out.println(cadenadni);
                    break;
                case 9:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "D";
                    System.out.println(cadenadni);
                    break;
                case 10:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "X";
                    System.out.println(cadenadni);
                    break;
                case 11:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "B";
                    System.out.println(cadenadni);
                    break;
                case 12:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "N";
                    System.out.println(cadenadni);
                    break;
                case 13:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "J";
                    System.out.println(cadenadni);
                    break;
                case 14:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "Z";
                    System.out.println(cadenadni);
                    break;
                case 15:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "S";
                    System.out.println(cadenadni);
                    break;
                case 16:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "Q";
                    System.out.println(cadenadni);
                    break;
                case 17:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "V";
                    System.out.println(cadenadni);
                    break;
                case 18:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "H";
                    System.out.println(cadenadni);
                    break;
                case 19:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "L";
                    System.out.println(cadenadni);
                    break;
                case 20:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "C";
                    System.out.println(cadenadni);
                    break;
                case 21:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "K";
                    System.out.println(cadenadni);
                    break;
                case 22:
                    cadenadni = Integer.toString(numerodni);
                    cadenadni = cadenadni + "E";
                    System.out.println(cadenadni);
                    break;

            }

        } else {
            System.out.println("fuera");
        }
    }
}
