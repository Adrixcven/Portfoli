/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloc2;

import java.util.Scanner;

public class ejec2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean bucle = true;
        String letra;
        while (bucle) {
            letra = in.nextLine();
            switch (letra) {
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
                    bucle = false;
                    break;
                default:
                    break;
            }
        }
    }

    public static void cuadrado(Scanner in) {
        float lado = in.nextFloat();
        float area = lado * lado, perimetro = lado * 4;
        System.out.println("==Quadrat==");
        System.out.printf("Perímetre : %.2f", perimetro);
        System.out.printf("Superfície: %.2f", area);
    }

    public static void rectangulo(Scanner in) {
        System.out.println("==Rectangle==");
        int lado1 = in.nextInt();
        int lado2 = in.nextInt();
        float area = lado1 * lado2, perimetro = (lado1 * 2) + (lado2 *2);
        System.out.printf("Perímetre : %.2f", perimetro);
        System.out.printf("Superfície: %.2f", area);
    }

    public static void triangulo(Scanner in) {

    }

    public static void circulo(Scanner in) {
        System.out.println("==Rectangle==");
        float radio = in.nextInt();
        double area =  Math.PI*(radio*radio), perimetro = (2*Math.PI)*radio;
        System.out.printf("Perímetre : %.2f", perimetro);
        System.out.printf("Superfície: %.2f", area);
    }
}
