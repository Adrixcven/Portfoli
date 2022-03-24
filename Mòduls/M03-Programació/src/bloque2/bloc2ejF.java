package bloque2;

import java.util.Scanner;

public class bloc2ejF {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int distancia, velocidadmax;
        float distanciakm, tiempo, segcoche, velocidadmedia;
        System.out.println("Añade la distancia entre las camaras");
        distancia = in.nextInt();
        System.out.println("Añade la velocidad maxima");
        velocidadmax = in.nextInt();
        System.out.println("Añade el tiempo que tarda en pasar el coche en segundos");
        segcoche = in.nextInt();

        distanciakm = distancia / 1000;
        tiempo = (segcoche / 60) / 60;
        velocidadmedia = distanciakm / tiempo;

        if (velocidadmedia > velocidadmax * 1.2) {
                System.out.println("Puntos");
        }else if (velocidadmedia > velocidadmax) {
                System.out.println("Multa");
        } else {
            System.out.println("OK");
        }
    }
}
