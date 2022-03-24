package bloque2;

import java.util.Scanner;

public class bloc2ejE {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int año;
        System.out.println("Añade el año");
        año = in.nextInt();

        if (año % 4 == 0) {
            if (año % 100 == 0) {
                if (año % 400 == 0) {
                    System.out.println("Es un año bisiesto");
                } else {
                    System.out.println("No es año bisiesto");
                }
            } else {
                System.out.println("Es año bisiesto");
            }
        } else {
            System.out.println("No es año bisiesto");
        }

    }
}
