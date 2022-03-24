package bloque2;

import java.util.Scanner;

public class bloc2ejD {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota;

        System.out.println("Introduce la nota");
        nota = in.nextFloat();

        if (nota > 5) {
            System.out.println("La nota ha sido un Suspenso");
        } else if ((nota >= 5) && (nota <= 5.99)) {
            System.out.println("La nota ha sido un Aprovado");
        } else if ((nota >= 6) && (nota <= 6.99)) {
            System.out.println("La nota ha sido un Bien");
        } else if ((nota >= 7) && (nota < 8.50)) {
            System.out.println("La nota ha sido un Notable");
        } else if ((nota >= 8.50) && (nota <= 10)) {
            System.out.println("La nota ha sido un excelente");
        }

    }
}
