package EXAMENMAYO;

import java.util.Scanner;

public class JocDeTaula {

    private static int COLUMNA = 8;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] campo = new int[COLUMNA][COLUMNA];
        campo = creacion(campo);
        mostraTauler2(campo);
        int intentos = 1, contanegras = 0, fila = 0, columna = 0;
        boolean hecho = false;
        while ((intentos <= 10) && (!hecho)){
            System.out.println("Intent " + intentos + ":");
            System.out.println("Fila: ");
            fila = in.nextInt();
            System.out.println("columna: ");
            columna = in.nextInt();
            if(tocaVora(fila,columna)){
                System.out.println("No és vàlida. Toca la vora!");
            }else if(existeixFitxa(campo,fila,columna)){
                System.out.println("No és vàlida. Ja hi ha una fitxa!");
            }else{
                campo[columna][fila] = 2;
                System.out.println("Perfecte! La posició és vàlida");
                contanegras++;
            }
            if(contanegras == 4){
                hecho =true;
            }
            intentos++;
        }
        mostraTauler(campo);
    }
    public static int[][] creacion(int[][] campo){
        int count = 0, math = 0, countmath = 0;
        for (int i = 0; i < COLUMNA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                if(count < 20){
                    math = (int)((Math.random()*3));
                    if (math == 1){
                        campo[i][j] = 1;
                        count++;
                    } else{
                        campo[i][j] = 0;
                    }
                } else{
                    campo[i][j] = 0;
                }
            }
        }
        return campo;
    }
    public static boolean tocaVora(int fila, int columna) {
        if((fila == COLUMNA-1)||(fila == 0)||(columna == COLUMNA-1)||(columna == 0)){
            return true;
        } else{
            return false;
        }       
    }
    public static boolean existeixFitxa(int[][] tauler, int fila, int columna) {
        if(tauler[columna][fila] == 0){
            return false;
        } else{
            return true;
        }       
    }
    public static void mostraTauler(int[][] tauler){
        for (int[] x: tauler) {
            for(int y: x){
                if(y == 1){
                    System.out.print("B ");
                }else if(y == 2){
                    System.out.print("N ");
                }else{
                    System.out.print(y + " ");
                }

                
            }
            System.out.println("");
        }
    }
    public static void mostraTauler2(int[][] tauler){
        for (int i = 0; i<COLUMNA; i++) {
            for(int j =0;j<COLUMNA;j++){
                 if(tauler[i][j] == 1){
                     System.out.print("B ");
                 }else if(tauler[i][j] == 2){
                     System.out.print("N ");
                 }else{
                     System.out.print(tauler[i][j] + " ");
                 }
            }
            System.out.println("");
        }
    }
}
