package bloque2;

import java.util.Scanner;

public class bloc2ejA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int diaactual, mesactual, anyactual, dianaixement, mesnaixement, anynaixement, edat;
        boolean aniversari;
        
        System.out.println("Dia actual: ");
        diaactual = in.nextInt();
        System.out.println("Mes actual: ");
        mesactual = in.nextInt();
        System.out.println("Any actual: ");
        anyactual = in.nextInt();
        System.out.println("Dia de naixement: ");
        dianaixement = in.nextInt();
        System.out.println("Mes de naixement: ");
        mesnaixement = in.nextInt();
        System.out.println("Any de naixement: ");
        anynaixement = in.nextInt();

        edat = anyactual - anynaixement;
        if (mesnaixement > mesactual) {
            edat = edat - 1;
        } else if (mesnaixement == mesactual) {
            if (dianaixement > diaactual) {
                edat = edat - 1;
            } else if (dianaixement == diaactual) {
                System.out.println("Felicitats");
            }
        }
        System.out.println("Felicitats");
    }
}
