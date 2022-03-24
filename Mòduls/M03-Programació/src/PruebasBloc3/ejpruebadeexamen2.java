/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasBloc3;

import java.util.Scanner;

/**
 *
 * @author Adrix
 */
public class ejpruebadeexamen2 {

    public static final int animals = 5;
    public static final int mes = 31;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double[][] nom = new double[animals][mes];
        int suma = 0, max = 0, min = 0, numMax = 0, numMin = 0, maxtemp = 0, mintemp = 0, maxanimaltemp = 0, minanimaltemp, maxdiatemp = 0, mindiatemp, otros = 0;
        for (int i = 0; i < animals; i++) {
            suma = 0;
            for (int j = 0; j < mes; j++) {
                nom[i][j] = Math.random() * 100;
                System.out.print((String.format("%.2f", nom[i][j]) + " "));
                suma += nom[i][j];
                if (i == 0) {
                    maxtemp = (int) nom[i][j];
                    mintemp = (int) nom[i][j];
                    maxanimaltemp = i;
                    minanimaltemp = i;
                    maxdiatemp = j;
                    mindiatemp = j;
                } else {
                    if (nom[i][j] > maxtemp) {
                        maxtemp = (int) nom[i][j];
                        maxanimaltemp = i;
                        maxdiatemp = j;
                    }
                    if (nom[i][j] < mintemp) {
                        mintemp = (int) nom[i][j];
                        minanimaltemp = i;
                        mindiatemp = j;
                    }
                }
            }
            System.out.println("La media: " + suma / mes);
            if (i == 0) {
                max = i;
                min = i;
                numMax = suma;
                numMin = suma;
            } else {
                if (suma > numMax) {
                    max = i;
                    numMax = suma;
                }
                if (suma < numMin) {
                    min = i;
                    numMin = suma;
                }
            }
            System.out.println("");
        }

        System.out.println("El animal que ha tenido la mediana mas alta ha sido " + max);
        System.out.println("El animal " + maxanimaltemp + " ha sido el que ha tenido mas temperatura el dia " + maxdiatemp);
        for (int i = 0; i < animals; i++) {
            if (i == maxanimaltemp) {
                i++;
                if (i == animals) {
                    break;
                }
            }
            System.out.println("El animal " + i + " ha tenido en el dia " + maxdiatemp + " la temperatura " + nom[i][maxdiatemp]);
        }
    }

}
