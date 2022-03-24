package Bloc1;

import java.util.Scanner;

public class Bloc1_5 {

    public static void main(String[] args) {

        Scanner inNum = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        
        System.out.println("Intro primer producte");
        String prod1 = inStr.nextLine().toLowerCase();
        System.out.println("Intro quantiat mínima primer producte");
        Float quant1 = inNum.nextFloat();

        System.out.println("Intro segon producte");
        String prod2 = inStr.nextLine().toLowerCase();
        System.out.println("Intro quantiat mínima segon producte");
        Float quant2 = inNum.nextFloat();

        System.out.println("Intro tercer producte");
        String prod3 = inStr.nextLine().toLowerCase();
        System.out.println("Intro quantiat mínima tercer producte");
        Float quant3 = inNum.nextFloat();        
        
        String prod;
        Float quant;
        
        do{
            System.out.println("Intro Producte");
            prod = inStr.nextLine().toLowerCase();
            if ( prod.equals("fi")) break;

            System.out.println("Intro quantiat en magatzem");
            quant = inStr.nextFloat();            

            if ( prod.equals(prod1)) {
                if (quant > quant1){
                    System.out.println("Et sobren " + (quant - quant1));
                } else if (quant < quant1){
                    System.out.println("Et manquen " + (quant1 - quant));
                } else {
                    System.out.println("Estàs ajustat");
                }
            } else if ( prod.equals(prod2)) {
                if (quant > quant2){
                    System.out.println("Et sobren " + (quant - quant2));
                } else if (quant < quant2){
                    System.out.println("Et manquen " + (quant2 - quant));
                } else {
                    System.out.println("Estàs ajustat");
                }                
            } else if ( prod.equals(prod3)) {
                if (quant > quant3){
                    System.out.println("Et sobren " + (quant - quant3));
                } else if (quant < quant3){
                    System.out.println("Et manquen " + (quant3 - quant));
                } else {
                    System.out.println("Estàs ajustat");
                }                
            } else {
                System.out.println("No és un producte registrat. Revisa el que ha teclejat");
            }
        } while (!prod.equals("fi"));
        
        
    
    }
}
