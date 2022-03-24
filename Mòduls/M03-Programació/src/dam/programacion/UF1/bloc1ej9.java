package dam.programacion.UF1;

import java.util.Scanner;
import java.lang.Math;

public class bloc1ej9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double n1, n2, elevado1, elevado2, resultat;

        System.out.println("Valor1:");
        n1 = in.nextDouble();
        System.out.println("Valor2:");
        n2 = in.nextDouble();
        elevado1 = Math.pow(n1, 2);
        elevado2 = Math.pow(n2, 2);
        resultat = Math.sqrt(elevado1 + elevado2);

        System.out.println("Resultat:" + resultat);

    }
}
