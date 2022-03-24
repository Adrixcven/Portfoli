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
public class ejercicio12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contador = 0, numero = 0, num;
        String mostrar = "", numa = "";
        for (int i = 10; i > 0; i--) {
            num = i;
            mostrar = num + "";
            while (contador < i - 1) {
                numa = num - 1 + "";
                mostrar = mostrar + "" + numa;
                contador++;
                num--;
            }
            System.out.println(mostrar);
            contador = 0;
            mostrar = "";
            num = i - 1;
        }
    }
}
