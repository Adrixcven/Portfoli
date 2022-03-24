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
public class ejercicio1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contador = 0, numero = 0;
        while (contador < 20) {
            if (numero % 2 == 0) {
            } else {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }

    }
}
