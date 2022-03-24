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
public class bloc3ej9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float alumnos, aprobats = 0, suspesos = 0, aprobatsfinal = 0, suspesosfinal = 0;
        for (alumnos = 0; alumnos < 40; alumnos++) {
            System.out.println("introduce la nota");
            int nota = in.nextInt();
            if (nota >= 0 && nota <= 10) {
                if (nota < 5) {
                    suspesos++;
                    suspesosfinal = suspesosfinal + nota;
                } else {
                    aprobats++;
                    aprobatsfinal = aprobatsfinal + nota;
                }
            }
        }
        System.out.println("Hay " + aprobats + " alumnes aprobats y " + suspesos + " alumnes suspesos");
        System.out.println("La media de aprobados es " + (aprobatsfinal / aprobats) + " y la media de suspesos es " + (suspesosfinal / suspesos));
        System.out.println("La proportcion de aprobados es " + ((aprobats/alumnos)*100));
        System.out.println("La proportcion de suspendidos es " + ((suspesos/alumnos)*100));
    }
}
