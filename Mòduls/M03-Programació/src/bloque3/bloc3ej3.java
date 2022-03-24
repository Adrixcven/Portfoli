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
public class bloc3ej3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int resultat;
        double salarionuevo = 0;
        boolean masempleats = true;
        while (masempleats) {
            System.out.println("Cuanto dinero ganabas?");
            int salario = in.nextInt();
            if (salario > 0 && salario <= 9000) {
                salarionuevo = salario * 1.2;
            } else if (salario >= 9001 && salario <= 15000) {
                salarionuevo = salario * 1.1;
            } else if (salario >= 15001 && salario <= 20000) {
                salarionuevo = salario * 1.05;
            } else if (salario > 20000) {
                salarionuevo = salario;
            }
            System.out.println("El nuevo salario es: " + salarionuevo);
            salarionuevo = 0;
            System.out.println("--------------");
            System.out.println("hay mas empleados?");
            resultat = in.nextInt();
            if (resultat != 1) {
                masempleats = false;
            }
        }
    }
}
