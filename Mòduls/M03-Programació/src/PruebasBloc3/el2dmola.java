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
public class el2dmola {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] nom = new int [4][5];
        int num = 1, cont = 0, contador = 0;
        for (int i = 0; i < nom.length;i++){
            System.out.println(i);
            num = i;
            cont = 0;
            for (int j = 0; j<nom[i].length;j++){
                if (j == 0){
                    System.out.print(i + " ");
                    cont += i; 
               } else{ 
                    num = num * 2;
                    System.out.print(num + " ");
                }
            }
            System.out.println("");
            System.out.println("La suma " + (i+1) + " es = " + cont);
            contador += cont;
            System.out.println("");
        }
        System.out.println("La suma final es " + contador);
    }
}
