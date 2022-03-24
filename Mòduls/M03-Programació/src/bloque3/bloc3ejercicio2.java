package bloque3;

import java.util.Scanner;

public class bloc3ejercicio2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        System.out.println("cuantos trabajadores hay?");
        int num_empleats = in.nextInt();
        System.out.println("Cuanto pagan por hora?");
        int €xH = in.nextInt();
        for (int i = 0; i < num_empleats; i++) {
            System.out.println("Cuantas horas ha trabajado?");
            int horas = in.nextInt(), horasextras = horas - 40;
            if(horas > 40){
                total = (40 * €xH) + (horasextras * (€xH*1.5));
            } else{
                total = horas * €xH;
            }
            System.out.println("Este empleado ha ganado " + total + "euros");
            System.out.println("-------");
            total = 0;
            }

        }

    }
