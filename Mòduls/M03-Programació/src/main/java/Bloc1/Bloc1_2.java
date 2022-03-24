package Bloc1;

import java.util.Scanner;

public class Bloc1_2 {

    public static void main(String[] args) {

        Scanner intro = new Scanner(System.in);
        int opcio,num;
        boolean  sortir = false;
        
        do {
            System.out.println("Selecciona una opció...");
            System.out.println("Menú d'opcions");
            System.out.println("1. Reserva taula");
            System.out.println("2. Carta");
            System.out.println("3. Fes el compte");
            System.out.println("4. Pla \"Clients Fidels\"");
            System.out.println("5. Receptari");
            System.out.println("6. Inventari cuina");
            System.out.println("7. Sortir");
            
            System.out.println("Introdueix una opció");
            opcio = intro.nextInt();
            switch (opcio){
                case 1:
                    System.out.println("Opcio : Reserva taula");
                    break;
                case 2:
                    System.out.println("Opcio : Carta");
                    break;
                case 3:
                    System.out.println("Opcio : Fes el compte");
                    break;
                case 4:
                    System.out.println("Opcio : Pla \"Clients Fidels\"");
                    break;
                case 5:
                    System.out.println("Opcio : Receptari");
                    break;
                case 6:
                    System.out.println("Opcio : Inventari cuina");
                    break;                    
                case 7:
                    System.out.println("Opcio : Sortir");
                    sortir = true; 
                    break; 
                default:
                    System.out.println("Opció no vàlida");
            }
            
        } while ( sortir == false );
        
        
    }
}
