/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloque3;

import java.util.Scanner;

/**
 *
 * @author Adrix
 */
public class bloc3ejc {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero");
        boolean sino = true;
        int cont, contador = 0, num=1;
           while (contador <30){
               cont = 2;
               while ((cont <= num /2) && (sino)) {
                   if (num%cont == 0){
                       sino = false;
                   }
                   cont++;
               }
               if (sino) {
                   System.out.println(num);
                   contador++;
               }
               num++;
               sino = true;
        }
    }
}
