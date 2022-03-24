/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bloc3;

import java.util.Scanner;

/**
 *
 * @author Adrix
 */
public class Bloc3_2 {

    public static final int clients = 5;
    public static final int plats = 10;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String client[] = new String[clients];
        String plat[] = new String[plats];
        int[][] num = new int[clients][plats];
        int i = 0, j = 0, max = 0, maxnum = 0;

        for (i = 0; i < clients; i++) {
            System.out.println("Nombre de mejor cliente");
            client[i] = in.nextLine();
        }
        for (j = 0; j < plats; j++) {
            System.out.println("Nombre del plato");
            plat[j] = in.nextLine();
        }
        for (i = 0; i < clients; i++) {
            System.out.println("Cliente " + i);
            for (j = 0; j < plats; j++) {
                System.out.println("Dame la cantidad de platos pedidos de " + plat[j]);
                num[i][j] = in.nextInt();
                if (j == 0) {
                    max = num[i][j];
                    maxnum = j;
                } else if (max < num[i][j]) {
                    max = num[i][j];
                    maxnum = j;
                }
            }
            System.out.println("El plato favorito del cliente " + client[i] + " ha sido " + plat[maxnum] + " pedido " + max + " veces");

        }
    }
}
