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
public class bloc3ejD {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero1 = 0;
        int numero2 = 1, numerosuma = 0;
        System.out.println("0");
        while (numero2 < 30) {
            numerosuma = numero1 + numero2;
            numero1 = numero2;
            numero2 = numerosuma;
            System.out.println(numero1);
            System.out.println(numero2);
        }
    }
}
