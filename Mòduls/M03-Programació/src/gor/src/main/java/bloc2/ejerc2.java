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
public class ejerc2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean repetir = true;
        while (repetir == true) {
            String opcion = in.nextLine().toLowerCase();
            switch (opcion) {
                case "q":
                    cuadrado(in);
                    break;
                case "r":
                    rectangulo(in);
                    break;
                case "t":
                    triangulo(in);
                    break;
                case "c":
                    circulo(in);
                    break;
                case "s":
                    repetir = false;
                    break;
                default:
                    break;
            }
        }
    }

    public static void cuadrado(Scanner in) {
        double lado = in.nextDouble();
        System.out.println("==Quadrat==");
        System.out.printf("Perímetre : %.2f \n", (lado * 4));
        System.out.printf("Superfície: %.2f \n", (lado * lado));
    }

    public static void rectangulo(Scanner in) {
        double lado1 = in.nextDouble();
        double lado2 = in.nextDouble();
        System.out.println("==Rectangle==");
        System.out.printf("Perímetre : %.2f \n", ((lado1 + lado2) * 2));
        System.out.printf("Superfície: %.2f \n", (lado1 * lado2));

    }

    public static void triangulo(Scanner in) {
        double lado = in.nextDouble(), base = in.nextDouble();
        double area = (base * Math.sqrt((Math.pow(lado, 2) - (Math.pow(base, 2) / 4)))) / 2;
        System.out.println("==Triangle isòsceles==");
        System.out.printf("Perímetre : %.2f \n", (base + (lado + lado)));
        System.out.printf("Superfície: %.2f \n", area);
    }

    public static void circulo(Scanner in) {
        double radio = in.nextDouble();
        double perimetro = (2 * Math.PI * radio);
        System.out.println("==Cercle==");
        System.out.printf("Perímetre : %.2f \n", perimetro);
        System.out.printf("Superfície: %.2f \n", (Math.PI * (radio * radio)));
    }
}
