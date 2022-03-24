/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloque4;

import java.util.Scanner;

public class ejercicio20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner ine = new Scanner(System.in);
        boolean repetir = true;
        int bonus, repetira = 0, contador = 0;
        while (repetir = true) {
            System.out.println("Nombre del trabajador:");
            String nombre = ine.nextLine();
            System.out.println("Años en la empresa:");
            int años = in.nextInt();
            if (años >= 3 && años < 10) {
                bonus = 300;
                System.out.println("El bonus del trabajador " + nombre + " es de " + bonus);
            } else if (años >= 10 && años < 15) {
                bonus = 400;
                System.out.println("El bonus del trabajador " + nombre + " es de " + bonus);
            } else if (años >= 15) {
                bonus = 700;
                System.out.println("El bonus del trabajador " + nombre + " es de " + bonus);
            }
            contador++;
            System.out.println("Mas trabajadores? 1-si 0-no");
            repetira = in.nextInt();
            if (repetira == 1) {
                repetir = true;
            } else if (repetira == 0) {
                repetir = false;
            }
        }
        System.out.println("Se han repartido " + contador + " bonuses");
    }
}
