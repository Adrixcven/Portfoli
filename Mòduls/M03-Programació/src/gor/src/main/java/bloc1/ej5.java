/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloc1;

import java.util.Scanner;

/**
 *
 * @author Adrix
 */
public class ej5 {

    private static int COLUMNA = 10;
    private static int LONGITUD = 10;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriu = new int[COLUMNA][LONGITUD];
        for (int i = 0; i < COLUMNA; i++) {
            for (int j = 0; j < LONGITUD; j++) {
                matriu[i][j] = (int) (Math.random() * 100);
            }
        }
        menu(in, matriu);
    }

    public static void mostraMatriu(int[][] matriu) {
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] demanaMatriu(int files, int columnes, Scanner in) {
        int[][] matriu = new int[columnes][files];
        for (int i = 0; i < columnes; i++) {
            for (int j = 0; j < files; j++) {
                matriu[i][j] = in.nextInt();
            }
        }
        return matriu;

    }

    public static int[][] generaMatriu(int files, int columnes, int min, int max) {
        int[][] matriu = new int[COLUMNA][LONGITUD];
        for (int i = 0; i < COLUMNA; i++) {
            for (int j = 0; j < LONGITUD; j++) {
                matriu[i][j] = ((int) (Math.random() * max) + min);
            }
        }
        return matriu;

    }

    public static void menu(Scanner in, int[][] matriu) {
        boolean menu = false;
        int escribe;
        do {
            System.out.println("Navega por nuestro menú:");
            System.out.println("1.Ejercicio 1");
            System.out.println("2.Ejercicio 2");
            System.out.println("3.Ejercicio 3");
            escribe = in.nextInt();
            switch (escribe) {
                case 1:
                    System.out.println("Enunciado 1");
                    mostraMatriu(matriu);
                    break;
                case 2:
                    System.out.println("Enunciado 2");
                    System.out.println("Dame las filas");
                    int files = in.nextInt();
                    System.out.println("Dame las columnas");
                    int columnes = in.nextInt();
                    matriu = demanaMatriu(files, columnes, in);
                    mostraMatriu(matriu);
                    break;
                case 3:
                    System.out.println("Enunciado 3");
                    System.out.println("Dame las filas");
                    files = in.nextInt();
                    System.out.println("Dame las columnas");
                    columnes = in.nextInt();
                    System.out.println("Dame el minimo");
                    int min = in.nextInt();
                    System.out.println("dame el maximo");
                    int max = in.nextInt();
                    matriu = demanaMatriu(files, columnes, in);
                    mostraMatriu(matriu);
                    break;
                default:
                    System.out.println("No existe esta opcion");
            }

        } while (menu == false);
    }
}
