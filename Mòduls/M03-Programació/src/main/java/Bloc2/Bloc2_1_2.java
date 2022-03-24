package Bloc2;

import java.util.Scanner;

public class Bloc2_1_2 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double[] clients = new double[100]; 
        int j = 0;
        boolean  sortir = true;
        System.out.println("Intro -1 quan acabis");
        for ( int i = 0 ; i < clients.length && sortir == true ; i++){
            clients[i] = in.nextDouble() ;
            if ( clients[i] == -1 ){
                sortir = false;
            }
            else {
                j++;
            }
        }
        
        double max=0, min=0, total = 0;
        for ( int i = 0 ; i < j ; i++){
            if ( i == 0){
                max = clients[i];
                min = clients[i];
            }
            if ( clients[i] > max) max = clients[i];
            if ( clients[i] < min) min = clients[i];
            
            total = total + clients[i];
        }
        double mitjana = total / j;
        
        System.out.println("Màxim: " + max);
        System.out.println("Mínim: " + min);
        System.out.println("Total: " + total);
        System.out.println("Mitjana: " + mitjana);
    }
}
