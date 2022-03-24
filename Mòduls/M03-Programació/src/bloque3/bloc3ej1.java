
package bloque3;

import java.util.Scanner;

public class bloc3ej1 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int resultat = 1;
            System.out.println("Introduce el valor maximo");
        int valor = in.nextInt();
        
        for (int i = valor; i >= 1; i--){
            resultat = i * resultat;
        }
        System.out.println("El valor en for es " + resultat);
        int i = valor;
        resultat = 1;
         while (i >= 1){
             resultat = resultat * i;
             i--;
         }
            System.out.println("El valor en while es " + resultat);
         i = valor;
         resultat = 1;
         do {
             resultat = resultat * i;
             i--;
         } while (i >= 1);
         System.out.println("El valor en do while es " + resultat);
        
        }
        
    
}
