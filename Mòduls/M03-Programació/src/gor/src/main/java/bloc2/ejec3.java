/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloc2;

/**
 *
 * @author Adrix
 */
import java.util.Scanner;

public class ejec3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean repetir = true;
        while (repetir == true) {
            String opcion = in.nextLine().toLowerCase();
            switch (opcion) {
                case "c":
                    cilindro(in);
                    break;
                case "h":
                    hexaedro(in);
                    break;
                case "t":
                    tetraedro(in);
                    break;
                case "e":
                    esfera(in);
                    break;
                case "s":
                    repetir = false;
                    break;
                default:
                    break;
            }
        }
    }

    public static void cilindro(Scanner in) {
        double radio = in.nextDouble();
        double altura = in.nextDouble();
        System.out.println("==Cilindre==");
        System.out.printf("Superfície: %.2f \n", 2 * Math.PI * (radio * altura));
        System.out.printf("Volum: %.2f \n", (2 * Math.PI) * radio);
    }

    public static void hexaedro(Scanner in) {
        int altura = in.nextInt();
        double area = 6 * (altura * altura);
        double volumen = altura * altura * altura;
        System.out.println("==Hexaedre==");
        System.out.printf("Superfície: %.2f \n", area);
        System.out.printf("Volum: %.2f \n", volumen);
    }

    public static void tetraedro(Scanner in) {
        double aresta = in.nextDouble();
        double area = Math.sqrt(3)*(aresta*aresta);
        double volumen = (Math.sqrt(2)/12)*(aresta*aresta*aresta);
        System.out.println("==Tetraedre==");
        System.out.printf("Superfície: %.2f \n", area);
        System.out.printf("Volum: %.2f \n", volumen);
    }

    public static void esfera(Scanner in) {
        double radio = in.nextDouble();
        double area = 4 * Math.PI * Math.pow(radio,2);
        double volumen = (4 * Math.PI * Math.pow(radio,3)) / 3;
        System.out.println("==Esfera==");
        System.out.printf("Superfície: %.2f \n", area);
        System.out.printf("Volum: %.2f \n", volumen);
    }
}
