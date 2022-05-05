/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloc2;

import java.util.Scanner;

/**
 *
 * @author Adrix
 */
public class ejpractica3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean win = false, palabrareal = false, esta = false, est = false;
        String palabrasec = "patata", palabraoculta = "", letras = "", letra = "";
        int intentos = 0;
        for (int i = 0; i < palabrasec.length(); i++) {
            palabraoculta = palabraoculta + "*";
        }
        while (est == false) {
            palabrareal = false;
            dibujo(intentos);
            System.out.println("Palabra: " + palabraoculta);
            System.out.println("Lletres: -->" + letras + "<--");
            while (palabrareal == false) {
                System.out.println("Introdueix lletra: ");
                letra = in.nextLine();
                if (salir(letras, letra)) {
                    letras = letras + letra;
                    palabrareal = true;
                }
            }
            for (int i = 0; i < palabrasec.length(); i++) {
                if (palabrasec.charAt(i) == letra.charAt(0)) {
                    StringBuilder cadenaModi = new StringBuilder(palabraoculta);//Creamos un builder a partir del String original
                    cadenaModi.setCharAt(i, palabrasec.charAt(i));
                    palabraoculta = cadenaModi.toString();
                    esta = true;
                }
            }
            if (!esta) {
                intentos++;
            }
            esta = false;
            letra = "";
            if (palabrasec.equals(palabraoculta)) {
                est = true;
            }

        }
        if (palabrasec.equals(palabraoculta)) {
            win = true;
        }
        if (win) {
            System.out.println("Has ganado!");
        } else {
            System.out.println("OOOOOoooohhhh! Has perdut!!");
            System.out.println("La paraula secreta era: " + palabrasec);
        }
    }

    public static boolean salir(String letras, String letra) {
        for (int i = 0; i < letras.length(); i++) {
            if (letra.charAt(0) == letras.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void dibujo(int intentos) {
        switch (intentos) {
            case 0:
                System.out.println("   ----  ");
                System.out.println("  |      ");
                System.out.println("  |      ");
                System.out.println("  |      ");
                System.out.println("  |      ");
                System.out.println("  |      ");
                System.out.println("  |      ");
                System.out.println(" - -");
                System.out.println("|   |");
                System.out.println("|    ------");
                System.out.println("|          |");
                System.out.println("|          |");
                System.out.println(" ----------");
                break;
            case 1:
                System.out.println("   ----- ");
                System.out.println("  |     |");
                System.out.println("  |      ");
                System.out.println("  |      ");
                System.out.println("  |      ");
                System.out.println("  |      ");
                System.out.println("  |      ");
                System.out.println(" - -");
                System.out.println("|   |");
                System.out.println("|    ------");
                System.out.println("|          |");
                System.out.println("|          |");
                System.out.println(" ----------");
                break;
            case 2:
                System.out.println("   ----- ");
                System.out.println("  |     |");
                System.out.println("  |     o");
                System.out.println("  |     ");
                System.out.println("  |      ");
                System.out.println("  |      ");
                System.out.println("  |      ");
                System.out.println(" - -");
                System.out.println("|   |");
                System.out.println("|    ------");
                System.out.println("|          |");
                System.out.println("|          |");
                System.out.println(" ----------");
                break;
            case 3:
                System.out.println("   ----- ");
                System.out.println("  |     |");
                System.out.println("  |     o");
                System.out.println("  |     |");
                System.out.println("  |      ");
                System.out.println("  |      ");
                System.out.println("  |      ");
                System.out.println(" - -");
                System.out.println("|   |");
                System.out.println("|    ------");
                System.out.println("|          |");
                System.out.println("|          |");
                System.out.println(" ----------");
                break;
            case 4:
                System.out.println("   ----- ");
                System.out.println("  |     |");
                System.out.println("  |     o");
                System.out.println("  |    /|");
                System.out.println("  |      ");
                System.out.println("  |      ");
                System.out.println("  |      ");
                System.out.println(" - -");
                System.out.println("|   |");
                System.out.println("|    ------");
                System.out.println("|          |");
                System.out.println("|          |");
                System.out.println(" ----------");
                break;
            case 5:
                System.out.println("   ----- ");
                System.out.println("  |     |");
                System.out.println("  |     o");
                System.out.println("  |    /||");
                System.out.println("  |      ");
                System.out.println("  |      ");
                System.out.println("  |      ");
                System.out.println(" - -");
                System.out.println("|   |");
                System.out.println("|    ------");
                System.out.println("|          |");
                System.out.println("|          |");
                System.out.println(" ----------");
                break;
            case 6:
                System.out.println("   ----- ");
                System.out.println("  |     |");
                System.out.println("  |     o");
                System.out.println("  |    /||");
                System.out.println("  |     |");
                System.out.println("  |      ");
                System.out.println("  |      ");
                System.out.println(" - -");
                System.out.println("|   |");
                System.out.println("|    ------");
                System.out.println("|          |");
                System.out.println("|          |");
                System.out.println(" ----------");
                break;
            case 7:
                System.out.println("   ----  ");
                System.out.println("  |     |");
                System.out.println("  |     o");
                System.out.println("  |    /||");
                System.out.println("  |     |");
                System.out.println("  |    /  ");
                System.out.println("  |      ");
                System.out.println(" - -");
                System.out.println("|   |");
                System.out.println("|    ------");
                System.out.println("|          |");
                System.out.println("|          |");
                System.out.println(" ----------");
                break;
            case 8:
                System.out.println("   ----  ");
                System.out.println("  |     |");
                System.out.println("  |     o");
                System.out.println("  |    /||");
                System.out.println("  |     |");
                System.out.println("  |    / |");
                System.out.println("  |      ");
                System.out.println(" - -");
                System.out.println("|   |");
                System.out.println("|    ------");
                System.out.println("|          |");
                System.out.println("|          |");
                System.out.println(" ----------");
                break;
            default:
                break;
        }
    }
}
