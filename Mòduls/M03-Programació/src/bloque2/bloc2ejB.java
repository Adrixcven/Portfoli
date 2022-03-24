package bloque2;

import java.util.Scanner;

public class bloc2ejB {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int precio, preciofinal, descuento;

        System.out.println("Introduce precio: ");
        precio = in.nextInt();
        descuento = precio / 100;

        if (precio > 10000) {
            preciofinal = precio - descuento * 10;
        } else {
            preciofinal = precio - descuento * 5;
        }
        System.out.println("El precio final es: " + preciofinal);
    }
}
