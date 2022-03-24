/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bloc4;

import java.util.Scanner;

/**
 *
 * @author Adrix
 */
public class menu {

    public static final int CLIENTS = 5;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Bloc4_1[] clientela = new Bloc4_1[CLIENTS];

        clientela[0] = new Bloc4_1("Joan", "123456", "joan@joan.com", 125.25, 10);
        clientela[1] = new Bloc4_1("Joana", "158964", "joana@joan.com", 15.25, 10);
        clientela[2] = new Bloc4_1("Maria", "458263", "maria@joan.com", 25.25, 15);
        clientela[3] = new Bloc4_1("Luci", "123444", "luci@joan.com", 54.45, 15);
        clientela[4] = new Bloc4_1("Mario", "166456", "mario@joan.com", 75.00, 20);

        int opcio = 0;
        while (opcio != 6) {
            opcio = menu(in);
            distribuidor(opcio, in2, clientela);
         }

    }

    public static void distribuidor(int opcio, Scanner in2, Bloc4_1[] clientela) {
        switch (opcio) {
            case 1:
                buscaCliente(clientela, in2);
                break;
            case 2:
                despesaGlobal(clientela);
                break;
            case 3:
                mejorClient(clientela);
                break;
            case 4:
                modificaCorreu(clientela, in2);
                break;
            case 5:
                modificaDescompte(clientela, in2);
                break;

        }
    }

    public static void buscaCliente(Bloc4_1[] clientela, Scanner in2) {
        System.out.println("busca el cliente y pon la info");
        System.out.println("Dame el NIF");
        String niff = in2.nextLine();
        for (int i = 0; i < CLIENTS; i++) {
            if (niff.equals(clientela[i].getNif())) {
                System.out.println(clientela[i].toString());
            }
        }
    }

    public static void despesaGlobal(Bloc4_1[] clientela) {
        System.out.println("muestra la despesa global");
        double suma = 0;
        for (int i = 0; i < CLIENTS; i++) {
            suma += clientela[i].getDespesaFeta();
        }
        System.out.println("La despesa es " + suma);
    }

    public static void mejorClient(Bloc4_1[] clientela) {
        System.out.println("Muestra la info del mejor ");
        int mejor = 0;
        double despesaMax = clientela[0].getDespesaFeta();
        for (int i = 1; i < CLIENTS; i++) {
            if (clientela[i].getDespesaFeta() > despesaMax) {
                mejor = i;
                despesaMax = clientela[i].getDespesaFeta();
            }
        }
        System.out.println(clientela[mejor].toString());
    }

    public static void modificaCorreu(Bloc4_1[] clientela, Scanner in2) {
        System.out.println("Modifica el correo");
        System.out.println("Dame el NIF");
        String niff = in2.nextLine();
        for (int i = 0; i < CLIENTS; i++) {
            if (niff.equals(clientela[i].getNif())) {
                System.out.println("El correo actual es " + clientela[i].getCorreu());
                System.out.println("Introduce el nuevo Correo");
                String cornuevo = in2.nextLine();
                clientela[i].setCorreu(cornuevo);
                System.out.println("El nuevo correo es " + clientela[i].getCorreu());
            }
        }
    }

    public static void modificaDescompte(Bloc4_1[] clientela, Scanner in2) {
        System.out.println("Modifica el descuento");
        System.out.println("Dame el NIF");
        String niff = in2.nextLine();
        for (int i = 0; i < CLIENTS; i++) {
            if (niff.equals(clientela[i].getNif())) {
                System.out.println("El descuento actual es " + clientela[i].getDescompte());
                System.out.println("Introduce el nuevo Descuento");
                int desnuevo = in2.nextInt();
                clientela[i].setDescompte(desnuevo);
                System.out.println("El nuevo correo es " + clientela[i].getDescompte());
            }
        }
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
