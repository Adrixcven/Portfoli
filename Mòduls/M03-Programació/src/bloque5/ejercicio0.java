/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloque5;

import java.util.Scanner;

/**
 *
 * @author Adrix
 */
public class ejercicio0 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float[] inventari = new float[10];
        float sumapar = 0, sumaimpar = 0;
        for (int i = 0; i < inventari.length; i++) {
            System.out.println("dame un numero");
            inventari[i] = in.nextInt();
            if (i % 2 == 0) {
                sumapar = sumapar + inventari[i];
            } else{
                sumaimpar = sumaimpar + inventari[i];
            }
        }
        System.out.println(sumapar);
        System.out.println(sumaimpar);
    }
}
