/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloque4;

import java.util.Scanner;

/**
 *
 * @author Adrix
 */
public class ejercicio19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner ine = new Scanner(System.in);
        boolean repetir = true;
        while (repetir = true) {
            repetir = true;
            System.out.println("Cuantas horas trabajaba el trabajador?");
            int horas = in.nextInt(), repetira = 0;
            float porcentaje;
            double dinero = 0;

            dinero = 30 * horas;
            System.out.println("En que turno trabajaba? M, T, N");
            String letra = ine.nextLine();
            char carac = letra.charAt(0);
            switch (carac) {
                case 'M':
                    dinero = dinero * 7;
                    System.out.println("La paga del trabajador sin taxes es " + dinero);
                    break;
                case 'T':
                    dinero = dinero * 7;
                    dinero = dinero * 1.2;
                    System.out.println("La paga del trabajador sin taxes es " + dinero);
                    break;
                case 'N':
                    dinero = dinero * 7;
                    dinero = dinero * 1.5;
                    System.out.println("La paga del trabajador sin taxes es " + dinero);
                    break;
            }
            if (dinero < 700) {
                porcentaje = ((float) dinero / 100) * 8;
                dinero = dinero - porcentaje;
                System.out.println("El salario final sera de " + dinero);
            } else if (dinero < 1100) {
                porcentaje = ((float) dinero / 100) * 10;
                dinero = dinero - porcentaje;
                System.out.println("El salario final sera de " + dinero);
            } else if (dinero >= 1100) {
                porcentaje = ((float) dinero / 100) * 8;
                dinero = dinero - porcentaje;
                System.out.println("El salario final sera de " + dinero);
            }
            System.out.println("Quieres poner otro trabajador? 1-si 2-no");
            repetira = in.nextInt();
            if (repetira == 1) {
                repetir = true;
            } else if (repetira == 2) {
                repetir = false;
            }
        }
    }
}
