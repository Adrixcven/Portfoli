package dam.programacion.UF1;

import java.util.Scanner;
import java.lang.Math;

public class bloc1ej7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double num, resultat;

        System.out.println("Valor:");
        num = in.nextFloat();

        resultat = Math.sqrt(num);

        System.out.println("Resultat:" + resultat);
    }
}
