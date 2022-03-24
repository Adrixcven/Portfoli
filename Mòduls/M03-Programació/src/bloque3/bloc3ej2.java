package bloque3;

import java.util.Scanner;

public class bloc3ej2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lados = 0, piedrastotal = 0;
        System.out.println("Introduce la maxima");
        int piedrasmax = in.nextInt();
        while (piedrastotal <= piedrasmax) {
            lados++;
            System.out.println(lados);
            piedrastotal = lados + piedrastotal;
            System.out.println(piedrastotal);
            System.out.println("----");
        }
        System.out.println(lados - 1);
        System.out.println(piedrasmax - (piedrastotal - lados));
    }
}
