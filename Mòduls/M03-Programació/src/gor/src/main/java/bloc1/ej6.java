/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloc1;

/**
 *
 * @author Adrix
 */
public class ej6 {

    private static int COLUMNA = 5;
    private static int LONGITUD = 5;

    public static void main(String[] args) {
        int[][] campo = new int[COLUMNA][LONGITUD];
        for (int i = 0; i < COLUMNA; i++) {
            for (int j = 0; j < LONGITUD; j++) {
                campo[i][j] = ((int) ((Math.random()*2) )-1);
            }
        }
        comptaMines(campo);
    }

    public static void comptaMines(int[][] campo) {
        for (int i = 0; i < COLUMNA; i++) {
            for (int j = 0; j < LONGITUD; j++) {
                if (campo[i][j] == 0) {
                    for (int e = i - 1; e <= i + 1; e++) {
                        for (int w = j - 1; w <= j + 1; w++) {
                            if((e == -1) || (e == COLUMNA) ||(w==-1)||(w==LONGITUD)){
                            } else{
                                if (campo[e][w] == -1) {
                                campo[i][j]++;
                            }
                            }
                            
                        }
                    }
                }
                System.out.print(campo[i][j] + " ");
            }
            System.out.println("");
        }

    }
;
}
