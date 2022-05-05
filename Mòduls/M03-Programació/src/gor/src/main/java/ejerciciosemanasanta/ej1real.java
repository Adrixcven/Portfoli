/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosemanasanta;

import java.util.Scanner;

/**
 *
 * @author Adrix
 */
public class ej1real {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        int cantidadpais = in.nextInt();
        String pais[] = new String[cantidadpais];
        for (int i = 0; i < cantidadpais; i++) {
            String paiss = in2.nextLine();
            pais[i] = paiss;
        }
        ordenaBombolla(pais);
        mostraVector(pais);
    }
    public static void ordenaBombolla(String[] primers) {
        String aux;
        for (int i = 0; i < primers.length - 1; i++) {
            for (int j = 0; j < primers.length - i - 1; j++) {
                if (primers[j].compareTo(primers[j + 1]) > 0) {
                    aux = primers[j + 1];
                    primers[j + 1] = primers[j];
                    primers[j] = aux;
                }
            }
        }

    }
    public static void mostraVector(String[] pais) {
        System.out.println("Països ordenats:");
        for (int i = 0; i < pais.length; i++) {
            System.out.println(pais[i]);
        }
    }
}
