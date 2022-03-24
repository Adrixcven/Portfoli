/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bloc3;

import java.util.Scanner;

/**
 * @author Adrix
 */
public class Bloc3_1 {

    public static final int filas = 3;
    public static final int columnas = 50;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] cuenta = new double[filas][columnas];
        int j = 0, max1dia = 0, max2dia = 0, max2tabla = 0, max3dia = 0, max3tabla = 0;
        double dia = 0, max1num = 0;
        for (int i = 0; i < filas; i++) {
            System.out.println("Mes " + i);
            dia = 0;
            for (j = 1; j != 0; j++) {
                cuenta[i][j] = (double) Math.random() * 10;
                dia += cuenta[i][j];
                if (max1dia == 0) {
                    max1dia = j;
                    max1num = cuenta[i][j];
                } else if (max1num < cuenta[i][j]) {
                    max1dia = j;
                    max1num = cuenta[i][j];
                }
                System.out.println("se han llegado a las 50 mesas, continuar? 0:No 1:Si");
                int resp = in.nextInt();
                if (resp == 0) {
                    break;
                }
            }
            System.out.println("Hemos ingresado " + dia);
            System.out.println("El dia mas ingresado ha sido " + max1dia);
            if (max2dia == 0) {
                max2dia = max1dia;
                max2tabla = i;
            } else if (max2dia < max1dia) {
                max2dia = max1dia;
                max2tabla = i;
            }

            if (max3tabla == 0) {
                max3dia = i;
                max3tabla = j;
            } else if (max3tabla < j) {
                max3dia = i;
                max3tabla = j;
            }
        }
        System.out.println("El dia que mas se ha pagado es " + max2dia + " y la tabla ha sido " + max2tabla);
        System.out.println("El dia que mas tablas se ha servido es " + max3dia);
    }
}
