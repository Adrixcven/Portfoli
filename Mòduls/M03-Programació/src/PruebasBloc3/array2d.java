/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasBloc3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Adrix
 */
public class array2d {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] prueba2d = new int[5][5];
        int numero = 1;
        //Arrays.fill(prueba2d,0);
        for (int i = 0; i < prueba2d.length; i++) {
            for (int j = 0; j < prueba2d[i].length; j++) {
                if (i == 0 || i == prueba2d.length -1) {
                    prueba2d[i][j] = numero;
                } else if ( j==0 || j==prueba2d[i].length -1){
                    prueba2d[i][j] = numero;
                }
            }
        }
        for (int i = 0; i < prueba2d.length; i++) {
            for (int j = 0; j < prueba2d[i].length; j++) {
                System.out.print(prueba2d[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
