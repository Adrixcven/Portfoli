/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Adrix
 */
public class Main {

    public static void Notes() {
        ArrayList<Alumne> Alumnos = new ArrayList<>(100);
        ArrayList<Integer> notas = new ArrayList<>(8);
        int num = 1;
        while (num > 0 || Alumnos.size() >= 100) {
            Scanner in = new Scanner(System.in);
            try {
                System.out.print("Introdueixi les dades de l'alumne:\n"
                        + "Nombre de matrícula (0 per acabar): ");
                num = in.nextInt();
                if (num > 0) {
                    System.out.print("Nombre del alumno: ");
                    in.nextLine();
                    String nom = in.nextLine();
                    int nota = 0, contador = 0, sum = 0;
                    for (int i = 0; i < 8; i++) {
                        System.out.println("Numero de la nota " + i + " : ");
                        nota = Alumne.InsertarNota();
                        if (nota <= 0) {
                            contador = i;
                            i = 8;
                        } else {
                            sum += nota;
                        }
                    }
                    nota = sum / contador;
                    System.out.println("La media de las notas de " + nom + " es " + nota);
                    Alumnos.add(new Alumne(num, nom, notas));
                    num = 1;
                }
            } catch (InputMismatchException e) {
                num = 1;
                System.out.println("valores introducidos no correctos");
            }
        }
        System.out.println("FI");
    }

    public static void main(String args[]) {
        Notes();
    }
}
