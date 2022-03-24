package bloque2;

import java.util.Scanner;

public class bloc2ej7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        System.out.println("Añade el año");
        numero = in.nextInt();

        if ((numero % 2 == 0) && (numero % 3 == 0)) {
            System.out.println("Es multiple de ambos");
        } else if (numero % 2 == 0) {
            System.out.println("es multiple de 2");
        } else if (numero % 3 == 0) {
            System.out.println("Es multiple de 3");
        } else {
            System.out.println("No es multiple de ninguno");
        }
    }
}