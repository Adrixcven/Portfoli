/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasBloc3;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i= 0, contador = 0;
        while (contador < 20){
            if (i % 2 == 1) {
                System.out.println(i + " es inpar");
                contador++;
            }
            i++;
        }
    }
}
