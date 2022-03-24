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
public class ejercicio13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contador = 0, maximo = 0, maximoantiguo = 0, num;
        String nume = "";
        System.out.println("Dame 10 numeros");
        nume = in.nextLine();
        for (int i = 0; i < nume.length(); i++) {
            num = nume.charAt(i);
            maximo = Math.max(maximoantiguo, num);
            maximoantiguo = maximo;
            if (maximo != maximoantiguo) {
                contador = 0;
            }
            contador++;
        }
    }
}
