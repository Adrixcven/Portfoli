/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloc2;

/**
 *
 * @author Adrix
 */
import java.util.Scanner;

public class ejpractica2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantes taules de multiplicar vols mostrar? ");
        int n = in.nextInt();
        for (int i = 0; i < n;) {
            System.out.println("");
            for (int j = 0; j < 10; j++) {
                System.out.println("");
                for (int k = 0; k < 4; k++) {
                    if (muntarLiniaPantalla(i, k, n)) {
            
                        System.out.print(muntarLiniaTaulaMultiplicar(i, j, k));
                    }
                }
            }
            i = i + 4;
        }

    }

    public static String muntarLiniaTaulaMultiplicar(int i, int j, int k) {
        String resultado = "";
        resultado = ((k + i + 1) + " x " + (j + 1) + " = " + ((k + i + 1) * (j + 1)) + "\t");
        return resultado;
    }

    public static boolean muntarLiniaPantalla(int i, int k, int n) {
        boolean introduce = false;
        if (i + k < n) {
            introduce = true;
        }
        return introduce;
    }
}
