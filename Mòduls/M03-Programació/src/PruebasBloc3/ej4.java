/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasBloc3;

import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("dime el numero de numeros que quieres");
        int cuantos = in.nextInt();
        int numero, maximo = 0, minimo = 0, total = 0, contador = 0;
        float aritmetica = 0;
        for (int i = 0; i < cuantos; i++) {
            System.out.println("dame el numero");
            numero = in.nextInt();
            total += numero;
            contador++;
            if (i == 0) {
                maximo = numero;
                minimo = numero;
            }

            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
        }
        aritmetica = total / contador;
        System.out.println("Maximo " + maximo);
        System.out.println("Minimo " + minimo);
        System.out.println("aritmetica " + aritmetica);
    }
}
