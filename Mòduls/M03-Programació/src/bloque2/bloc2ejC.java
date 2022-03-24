package bloque2;

import java.util.Scanner;

public class bloc2ejC {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a, b, c, mayor = 0;

        System.out.println("Introduce A:");
        a = in.nextFloat();
        System.out.println("Introduce B:");
        b = in.nextFloat();
        System.out.println("Introduce C:");
        c = in.nextFloat();

        if (a > b) {
            if (a > c) {
                mayor = a;
            } else if (a < c) {
                mayor = c;
            }
        } else if (a < b) {
            if (b > c) {
                mayor = b;
            } else if (b < c) {
                mayor = c;
            }
        }
        System.out.println("El mayor es = " + mayor);
    }
}
