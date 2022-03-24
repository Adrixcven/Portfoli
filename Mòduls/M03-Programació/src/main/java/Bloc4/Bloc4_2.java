package Bloc4;

import java.util.Scanner;

public class Bloc4_2 {

    public static final int clients = 5;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Bloc4_1[] clientela = new Bloc4_1[clients];

        clientela[0] = new Bloc4_1("Joan", "123456", "joan@joan.com", 125.25, 10);
        clientela[1] = new Bloc4_1("Joana", "158964", "joana@joan.com", 15.25, 10);
        clientela[2] = new Bloc4_1("Maria", "458263", "maria@joan.com", 25.25, 15);
        clientela[3] = new Bloc4_1("Luci", "123444", "luci@joan.com", 54.45, 15);
        clientela[4] = new Bloc4_1("Mario", "166456", "mario@joan.com", 75.00, 20);


        int opcio = 0;
        while (opcio != 6) {
            opcio = menu(in);
            distribuidor(opcio, in, clientela);
        }

    }

    public static void distribuidor(int opcio, Scanner in, Bloc4_1[] clientela) {
        switch (opcio) {
            case 1:
                cercaClient(clientela);
                break;
            case 2:
                despesaGlobal(clientela);
                break;
            case 3:
                millorClient(clientela);
                break;
            case 4:
                modificaCorreu(clientela);
                break;
            case 5:
                modificaDescompte(clientela);
                break;

        }
    }

    public static void cercaClient(Bloc4_1[] clientela) {
        System.out.println("Cerca client per NIF i mostra la seva informació");
    }

    public static void despesaGlobal(Bloc4_1[] clientela) {
        System.out.println("Mostra la despesa global de tots els clients");
    }

    public static void millorClient(Bloc4_1[] clientela) {
        System.out.println("Mostra la info del millor client");

    }

    public static void modificaCorreu(Bloc4_1[] clientela) {
        System.out.println("Modifica correu de client introduit per teclat");
    }

    public static void modificaDescompte(Bloc4_1[] clientela) {
        System.out.println("Modifica descompte de client introduit per teclat");
                
    }

    public static int menu(Scanner in) {
        int opcio;

        do {
            System.out.println("Selecciona una opció");
            System.out.println("1. Cerca client");
            System.out.println("2. Despesa global");
            System.out.println("3. Millor client");
            System.out.println("4. Modifica correu");
            System.out.println("5. Modifica descompte");
            System.out.println("6. sortir");
            opcio = in.nextInt();
        } while ((opcio < 0) || (opcio > 6));
        return opcio;

    }
}
