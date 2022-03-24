package Bloc2;

import java.util.Scanner;

public class Bloc2_1 {

    public static void main(String[] args) {
       
        double[] clients = new double[10]; 
        
        for ( int i = 0 ; i < clients.length ; i++){
            clients[i] = Math.random() * 50 ;
        }
        double max=0, min=0, total = 0;
        for ( int i = 0 ; i < clients.length ; i++){
            if ( i == 0){
                max = clients[i];
                min = clients[i];
            }
            if ( clients[i] > max) max = clients[i];
            if ( clients[i] < min) min = clients[i];
            
            total = total + clients[i];
        }
        double mitjana = total / clients.length;
        
        System.out.println("Màxim: " + max);
        System.out.println("Mínim: " + min);
        System.out.println("Total: " + total);
        System.out.println("Mitjana: " + mitjana);
    }
}
