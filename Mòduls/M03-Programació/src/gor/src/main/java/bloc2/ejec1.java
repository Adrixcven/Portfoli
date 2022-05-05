package bloc2;

import java.util.Scanner;

public class ejec1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        boolean hacer = true;
        String operacion, num;
        while (hacer) {
            if (in.hasNextInt()) {
                a = in.nextInt();
                b = in.nextInt();
                in.nextLine();
                operacion = in.nextLine();
                switch (operacion) {
                    case "+":
                        sumar(a, b);
                        break;
                    case "-":
                        restar(a, b);
                        break;
                    case "x":
                        multiplicar(a, b);
                        break;
                    case "/":
                        dividir(a, b);
                        break;
                    default:
                        break;
                }
            } else if (in.nextLine().equals("S")) {
                hacer = false;
            }

        }
    }

    public static void sumar(int a, int b) {
        int solucion = a + b;
        System.out.println(a + " + " + b + " = " + solucion);
    }

    public static void restar(int a, int b) {
        int solucion = a - b;
        System.out.println(a + " - " + b + " = " + solucion);
    }

    public static void multiplicar(int a, int b) {
        int solucion = a * b;
        System.out.println(a + " x " + b + " = " + solucion);
    }

    public static void dividir(int a, int b) {
        if (b == 0) {
            System.out.println("No es pot dividir per 0.");
        } else {
            int solucion = a / b;
            System.out.println(a + " / " + b + " = " + solucion);
        }

    }
}
