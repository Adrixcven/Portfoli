/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloc1;

import java.util.Scanner;

public class ej7 {

    private static int COLUMNA = 9;
    private static int LONGITUD = 9;

    public static void main(String[] args) {
        int[][] campo = new int[COLUMNA][LONGITUD];
        Scanner in = new Scanner(System.in);
        System.out.println("Cuantos sudokus vas a hacer?");
        int num = in.nextInt();
        for (int ñ = 0; ñ < num; ñ++) {
            campo = llegirSudoku();
            if (esFilaValida(campo) && esColumnaValida(campo) && esRegioValida(campo)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static int[][] llegirSudoku() {
        Scanner in = new Scanner(System.in);
        int[][] campo = new int[COLUMNA][LONGITUD];
        for (int i = 0; i < COLUMNA; i++) {
            for (int j = 0; j < LONGITUD; j++) {
                campo[i][j] = in.nextInt();
            }
        }   
        return campo;
    }

    public static boolean esFilaValida(int[][] sudoku) {
        int contador = 0;
        for (int i = 0; i < COLUMNA; i++) {
            for (int numero = 1; numero <= COLUMNA; numero++) {
                contador = 0;
                for (int j = 0; j < LONGITUD; j++) {
                    if (sudoku[i][j] == numero) {
                        contador++;
                    }
                    if (contador >= 2) {
                        return false;
                    }
                }
            }

        }
        return true;
    }

    public static boolean esColumnaValida(int[][] sudoku) {
        int contador = 0;
        for (int i = 0; i < LONGITUD; i++) {
            for (int numero = 1; numero <= COLUMNA; numero++) {
                contador = 0;
                for (int j = 0; j < COLUMNA; j++) {
                    if (sudoku[i][j] == numero) {
                        contador++;
                    }
                    if (contador >= 2) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean esRegioValida(int[][] sudoku) {
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) // row, col is start of the 3 by 3 grid
            {
                for (int pos = 0; pos < 8; pos++) {
                    for (int pos2 = pos + 1; pos2 < 9; pos2++) {
                        if (sudoku[row + pos % 3][col + pos / 3] == sudoku[row + pos2 % 3][col + pos2 / 3]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
