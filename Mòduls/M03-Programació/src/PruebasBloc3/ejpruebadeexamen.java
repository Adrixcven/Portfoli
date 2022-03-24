/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasBloc3;

import static PruebasBloc3.ejercicio31.productes;
import static PruebasBloc3.ejercicio31.venedors;
import java.util.Scanner;

/**
 *
 * @author Adrix
 */
public class ejpruebadeexamen {

    public static final int exercicis = 3;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Cuanta gente ha hecho el examen?");
        int alumne = in.nextInt(), cont = 0, examen = 0, max = 0, exmax = 0, min = 0, exmin = 0, contador = 0, medi = 0, media = 0, mediex = 0, mediaex = 0;
        int[][] alumnes = new int[alumne][exercicis];
        for (int i = 0; i < alumne; i++) {
            for (int j = 0; j < exercicis; j++) {
                System.out.println("Dame la nota del ejercicio del alumno");
                alumnes[i][j] = in.nextInt();
                cont += alumnes[i][j];
                if ((alumnes[i][j] > 10) || (alumnes[i][j] < 0)) {
                    System.out.println("Nota mala");
                    j--;
                }
            }
            examen = cont / exercicis;
            System.out.println(examen);
            if ((examen >= 5) && (examen <= 10)) {
                System.out.println("Examen aprovado");
                contador++;
            } else if ((examen < 5) && (examen >= 0)) {
                System.out.println("Examen suspendido");
            }
            if (i == 0) {
                max = examen;
                exmax = i;
                min = examen;
                exmin = i;
            } else {
                if (examen > max) {
                    max = examen;
                    exmax = i;
                }
                if (examen < min) {
                    min = examen;
                    exmin = i;
                }
            }
            mediex += examen;
            System.out.println(exmax);
        }
        mediaex = mediex / alumne;
        for (int j = 0; j < exercicis; j++) {
            medi = 0;
            for (int i = 0; i < alumne; i++) {
                medi += alumnes[i][j];
            }
            media = medi / alumne;
            System.out.println("La media del ejercicio" + j + " es: " + media);
        }
        System.out.println("El examen con mas nota: " + exmax + " y el que menos: " + exmin);
        System.out.println("La media de los ejercicios: " + media + "y la media de los examenes: " + mediaex);

    }
}
