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
public class el2dmola1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] nom = new int[10][50];
        int num = 1, cont = 0, contador = 0, si, num1, num2, maxnum = 0;
        double rand, max = 0;
        boolean continuar = true;
        for (int i = 0; i < nom.length; i++) {
            num = i;
            cont = 0;
            for (int j = 0; j < nom[i].length; j++) {
                nom[i][j] = (int) Math.random() * 100;
                System.out.print((String.format("%.2f", nom[i][j])) + " ");
            }
            System.out.println("");
            System.out.println("La suma " + (i + 1) + " es = " + cont);
            System.out.println("");
        }
        int i = 0;
        for (int j = 0; j < nom[0].length; j++) {
            cont = 0;
            for (i = 0; i < nom.length; i++) {
                cont += nom[i][j];
            }
            if (cont > max) {
                maxnum = i;
            }
        }
        System.out.println("El numero mas grande es " + (String.format("%.2f", max)) + " del producto " + maxnum);

        while (continuar = true) {
            System.out.println("Quieres mirar un numero? 1 = si, 2 = no");
            si = in.nextInt();
            if (si == 1) {
                System.out.println("dime un numero");
                num1 = in.nextInt();
                System.out.println("Dime la columna");
                num2 = in.nextInt();
                System.out.println("El numero es " + nom[num1][num2]);
            } else if (si == 2) {
                System.out.println("Ok boomer");
                continuar = false;
            } else {
                System.out.println("Numero equivocado");
            }
        }
    }
}
