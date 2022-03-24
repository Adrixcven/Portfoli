package Bloc1;

import java.util.Scanner;

public class Bloc1_7 {

    public static void main(String[] args) {

        Scanner inNum = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        
//        System.out.println("Intro primer producte");
//        String prod1 = inStr.nextLine().toLowerCase();
//        System.out.println("Intro preu primer producte");
//        Float preu1 = inNum.nextFloat();
//
//        System.out.println("Intro segon producte");
//        String prod2 = inStr.nextLine().toLowerCase();
//        System.out.println("Intro preu segon producte");
//        Float preu2 = inNum.nextFloat();
//
//        System.out.println("Intro tercer producte");
//        String prod3 = inStr.nextLine().toLowerCase();
//        System.out.println("Intro preu tercer producte");
//        Float preu3 = inNum.nextFloat();        
        
        System.out.println("Intro primer producte");
        String prod1 = "cervesa";
        System.out.println("Intro preu primer producte");
        double preu1 = 1.0;

        System.out.println("Intro segon producte");
        String prod2 = "aigua";
        System.out.println("Intro preu segon producte");
        double preu2 = 2;

        System.out.println("Intro tercer producte");
        String prod3 = "braves";
        System.out.println("Intro preu tercer producte");
        double preu3 = 3;                
        
        System.out.println("Intro String taula");
//        String cadenaTaula = inStr.nextLine();
        String cadenaTaula = "cervesa cervesa aigua braves musclos braves";
        cadenaTaula = cadenaTaula + " ";
        String producte = "";
        
        float compte = 0;
        for ( int i = 0 ; i < cadenaTaula.length() ; i++){
            if (cadenaTaula.charAt(i) != ' ' ){
                producte += cadenaTaula.charAt(i);
            } else {
                
                if ( producte.equals(prod1)){
                    compte  += preu1;
                    System.out.println("Producte : " + prod1 + " >> " + preu1);
                } else if ( producte.equals(prod2)){
                    compte  += preu2;
                    System.out.println("Producte : " + prod2 + " >> " + preu2);
                } else if ( producte.equals(prod3)){
                    compte  += preu3;
                    System.out.println("Producte : " + prod3 + " >> " + preu3);
                } else {
                    System.out.println("No es reconeix el producte " + producte);
                }
                producte = "";
            }
        }
        System.out.println("El compte és " + compte );
        
    
    }
}
