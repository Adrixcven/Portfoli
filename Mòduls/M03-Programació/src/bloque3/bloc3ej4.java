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
public class bloc3ej4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("introduce las horas");
        int horas = in.nextInt();
        System.out.println("introduce los minutos");
        int minutos = in.nextInt();
        System.out.println("introduce los segundos");
        int segundos = in.nextInt();
        segundos++;
        if (segundos >= 60) {
            segundos = 0;
            minutos++;
        }
        if (minutos >= 60) {
            minutos = 0;
            horas++;
        }
        System.out.println("tenemos " + horas + " horas, " + minutos + " minutos y " + segundos +" segundos");
    }
}
