/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner ine = new Scanner(System.in);
//        antes del bucle, creamos la booleana principal, los contadores y strings necesarias
        boolean finala = false;
        int contador = 0, contadorhome = 0, contadordona = 0, contador2040 = 0, contador4160 = 0, contador6180 = 0;
        int contador81 = 0, edadtotalhome = 0, edadtotaldona = 0;
        float medianahome = 0, medianadone = 0, porcentajehome = 0, porcentajedona = 0;
        String finalaw = "final";
        String home = "home";
        String dona = "dona";
//        creamos el while con la booleana y, si el nombre es igual a la string finalaw, se detiene.
        while (finala == false) {
            System.out.println("Dame nombre de persona");
            String nom = ine.nextLine();
            if (nom.equals(finalaw)) {
                finala = true;
            } else {
//          Si no ha sido igual a la string, continua pidiendo el sexo (guardando la cantidad de 
//          hombres y mujeres), y la edad, guardando los diferentes rangos, y si son de hombre y mujer
                System.out.println("Dame el sexo de la persona");
                String sexe = ine.nextLine();
                if (sexe.equals(home)) {
                    contadorhome++;
                } else if (sexe.equals(dona)) {
                    contadordona++;
                }
                System.out.println("Dame la edad de la persona");
                int edad = in.nextInt();
                if (edad >= 20 && edad < 40) {
                    contador2040++;
                    if (sexe.equals(home)) {
                        edadtotalhome += edad;
                    } else if (sexe.equals(dona)) {
                        edadtotaldona += edad;
                    }
                } else if (edad >= 41 && edad <= 60) {
                    contador4160++;
                    if (sexe.equals(home)) {
                        edadtotalhome += edad;
                    } else if (sexe.equals(dona)) {
                        edadtotaldona += edad;
                    }
                } else if (edad >= 61 && edad <= 80) {
                    contador6180++;
                    if (sexe.equals(home)) {
                        edadtotalhome += edad;
                    } else if (sexe.equals(dona)) {
                        edadtotaldona += edad;
                    }
                } else if (edad > 80) {
                    contador81++;
                    if (sexe.equals(home)) {
                        edadtotalhome += edad;
                    } else if (sexe.equals(dona)) {
                        edadtotaldona += edad;
                    }
                }
//              por ultimo, hace que se muestre por pantalla la string con nombre+edad.
                String cadenaedad = Integer.toString(edad);
                String nomedad = nom + edad;
                System.out.println(nomedad);
                contador++;
            }

        }
//        fuera del while, muestra los contadores y hace las medianas y porcentajes de los generos.
        System.out.println("Hay " + contador2040 + " de 20-40 años");
        System.out.println("Hay " + contador4160 + " de 41-60 años");
        System.out.println("Hay " + contador6180 + " de 61-80 años");
        System.out.println("Hay " + contador81 + " de mas de 80 años");
        medianahome = (float) edadtotalhome / contadorhome;
        medianadone = (float) edadtotaldona / contadordona;
        System.out.println("La medianas son " + medianahome + "d'home y " + medianadone + "de dona.");
        porcentajehome = ((float) contadorhome / contador) * 100;
        porcentajedona = ((float) contadordona / contador) * 100;
        System.out.println("Los porcentajes son = " + porcentajehome + "% d'homes y " + porcentajedona + "% dones.");

    }

}
