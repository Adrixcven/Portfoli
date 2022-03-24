/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasBloc3;

import java.util.Scanner;

/**
 *
 * @author Adrix
 */
public class ejercicio31 {

    public static final int venedors = 4;
    public static final int productes = 7;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] vendes = new int[venedors][productes];

        int contador = 0, max = 0, maxnum = 0, maxprod = 0, contador2 = 0, num, respuesta, maxvenda = 0;
        boolean continuar = true;

        for (int i = 0; i < venedors; i++) {
            contador = 0;
            for (int j = 0; j < productes; j++) {
                vendes[i][j] = (int) (Math.random() * 50);
                System.out.print(vendes[i][j] + " ");
                contador += vendes[i][j];

            }
            if (contador > max) {
                max = contador;
                maxnum = i;
            }
            System.out.println("");
        }
        for (int j = 0; j < productes; j++) {
            contador = 0;
            for (int i = 0; i < venedors; i++) {
                contador2 += vendes[i][j];
            }
            if (contador2 > max) {
                max = contador2;
                maxprod = j;
            }
        }
        System.out.println("El vendedor mas exitoso es " + (maxnum));
        System.out.println("El producto mas exitoso es " + (maxprod));
        do {
            System.out.println("Danos un numero de producto");
            num = in.nextInt();
            for (int u = 0; u < venedors; u++) {
                System.out.println("el vendedor " + u + " ha vendido " + vendes[u][num]);
            }
            System.out.println("Quieres continuar?");
            respuesta = in.nextInt();
            switch (respuesta) {
                case 1:
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("tonto");
                    break;
            }
        } while (continuar == true);

        //------segundo array-------
        int[][] precio = new int[1][productes];
        int maxprecio = 0, maxcaro = 0;
        for (int i = 0; i < 1; i++) {
            contador = 0;
            for (int j = 0; j < productes; j++) {
                precio[i][j] = (int) (Math.random() * 50);
                System.out.print(precio[i][j] + " ");
                contador += vendes[i][j] * precio[i][j];

            }
            if (contador > max) {
                max = contador;
                maxprecio = i;
            }
            System.out.println("");
        }
        for (int j = 0; j < productes; j++) {
            contador2 = 0;
            contador2 += precio[0][j];
            if (j == 0){
                max = contador2;
                maxcaro = j;
            }else if (contador2 > max) {
                max = contador2;
                maxcaro = j;
            }
        }

        //-------------------------
        System.out.println("El vendedor con mas ventas es " + (maxnum));
        System.out.println("El producto mas caro es " + (maxcaro));

        System.out.println("Danos un numero de producto");
        num = in.nextInt();
        for (int u = 0; u < venedors; u++) {
            maxvenda = maxvenda + (vendes[u][num] * precio[0][num]);
        }
        System.out.println("El producto ha vendido: " + maxvenda);

    }
}
