package Bloc1;

import java.util.Scanner;

public class Bloc1_4 {

    public static final double IVA = 0.05;
    public static final double DESCOMPTE = 0.05;
    
    public static void main(String[] args) {

        Scanner inNum = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        float preu, suma = 0;
        double preuFidel;
        String clientFidel ="";
        do{
            System.out.println("intro preu");
            preu = inNum.nextFloat();
            suma = suma + preu;
        } while ( preu != 0);
        
        System.out.println("La consumició és de " + suma);
        System.out.println("És un client fidel ? (S/N)");
        clientFidel = inStr.nextLine();
        
        if ( clientFidel.equals("S")){
            preuFidel = suma * (1 - DESCOMPTE);
            System.out.printf("Per ser client fidel el preu és %.2f",preuFidel);
            System.out.printf("\nEl preu amb IVA és %.2f", (preuFidel * (1 + IVA)));
        } else {
            System.out.printf("\nEl preu amb IVA és %.2f", (suma * (1 + IVA)));
        }
        
        
        
        
        
 
    }
}
