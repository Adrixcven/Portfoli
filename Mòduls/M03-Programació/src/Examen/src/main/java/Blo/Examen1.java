
package Blo;

import java.util.Scanner;

public class Examen1 {

    public static final int COLUMNA = 8;
    public static final int TABLA = 8;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        String[][] letrax = new String[COLUMNA][TABLA];
        letrax[1][1] = "x";
        letrax[1][2] = "x";
        letrax[1][3] = "x";
        letrax[1][4] = "x";
        letrax[1][5] = "x";
        int intents = 1, num1 = 0, num2 = 0, fichas = 0;
        while ((fichas < 4) & intents < 10) {
            System.out.println("Dame el 1 numero: ");
            num1 = in2.nextInt();
            System.out.println("Dame el 2 numero: ");
            num2 = in2.nextInt();
            if (num1 == 7) {
                if (letrax[num1 - 1][num2].equals("x")) {
                    System.out.println("Erroneo");
                    intents++;
                } else if ((letrax[num1][num2 - 1].equals("x")) || (letrax[num1][num2 + 1].equals("x"))) {
                    System.out.println("Erroneo");
                    intents++;
                } else if (letrax[num1 - 1][num2 - 1].equals("x")) {
                    System.out.println("Erroneo");
                    intents++;
                } else if (letrax[num1 - 1][num2 + 1].equals("x")) {
                    System.out.println("Erroneo");
                    intents++;
                } else if (letrax[num1][num2].equals("x")) {
                    System.out.println("Erroneo");
                    intents++;
                } else {
                    letrax[num1][num2] = "x";
                    System.out.println("Bien hecho!");
                    fichas++;
                    intents++;
                };
            } else if (num2 == 7) {
                if ((letrax[num1 - 1][num2].equals("x")) || (letrax[num1 + 1][num2].equals("x"))) {
                    System.out.println("Erroneo");
                    intents++;
                } else if ((letrax[num1][num2 - 1].equals("x")) || (letrax[num1][num2 + 1].equals("x"))) {
                    System.out.println("Erroneo");
                    intents++;
                } else if ((letrax[num1 - 1][num2 - 1].equals("x")) || (letrax[num1 + 1][num2 - 1].equals("x"))) {
                    System.out.println("Erroneo");
                    intents++;
                } else if ((letrax[num1 - 1][num2 + 1].equals("x")) || (letrax[num1 + 1][num2 + 1].equals("x"))) {
                    System.out.println("Erroneo");
                    intents++;
                } else if (letrax[num1][num2].equals("x")) {
                    System.out.println("Erroneo");
                    intents++;
                } else {
                    letrax[num1][num2] = "x";
                    System.out.println("Bien hecho!");
                    fichas++;
                    intents++;
                };
            } else {
                if ((letrax[num1-1][num2].equals("x")) || (letrax[num1 + 1][num2].equals("x"))) {
                    System.out.println("Erroneo");
                    intents++;
                } else if ((letrax[num1][num2 - 1].equals("x"))) {
                    System.out.println("Erroneo");
                    intents++;
                } else if ((letrax[num1 - 1][num2 - 1].equals("x")) || (letrax[num1 + 1][num2 - 1].equals("x"))) {
                    System.out.println("Erroneo");
                    intents++;
                } else if (letrax[num1][num2].equals("x")) {
                    System.out.println("Erroneo");
                    intents++;
                } else {
                    letrax[num1][num2] = "x";
                    System.out.println("Bien hecho!");
                    fichas++;
                    intents++;
                };
            }
        }
        if (intents < 10) {
            System.out.println("Que pena! No lo has superado ni con " + intents + " intentos");
        } else {
            System.out.println("Lo has conseguido! Has tardado " + intents + "Intentos");
        }
    }
}
