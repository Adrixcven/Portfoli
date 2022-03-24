package bloque4;

import java.util.Scanner;

public class ejercicio17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] habitantes = new int[5];
        int ciudadP = 0, ciudadM = 0, ciudadG = 0, cont = 0;
        float porcentajeP, porcentajeM, porcentajeG;
        for (int i = 0; i < habitantes.length; i++) {
            System.out.println("Cuantos habitantes hay?");
            habitantes[i] = in.nextInt();

            if (habitantes[i] < 2000) {
                ciudadP++;

            } else if ((habitantes[i] >= 2000) && (habitantes[i] <= 30000)) {
                ciudadM++;

            } else {
                ciudadG++;
            }
            cont++;

        }
        porcentajeP = ((float) habitantes[ciudadP] / cont) * 100;
        porcentajeM = ((float) habitantes[ciudadM] / cont) * 100;
        porcentajeG = ((float) habitantes[ciudadG] / cont) * 100;
    }
}
