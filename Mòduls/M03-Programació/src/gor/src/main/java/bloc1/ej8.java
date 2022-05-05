/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloc1;

public class ej8 {

    public static void main(String[] args) {
        int[] primos = new int[100];
        int nprimo = 0;
        int num = 0;
        while (nprimo != 100) {
            num++;
            if (esPrimo(num, primos)) {
                primos[nprimo] = num;
                System.out.println(primos[nprimo]);
                nprimo++;
            }
        }
    }

    public static boolean esPrimo(int num, int[] primos) {
        int divisibles = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisibles++;
            }

        }
        if (divisibles == 2) {
            return true;
        } else {
            return false;
        }

    }
}
