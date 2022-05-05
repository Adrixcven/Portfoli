/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloc1;

import java.util.Scanner;

/**
 *
 * @author Adrix
 */
public class ej3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame un numero");
        int numero = in.nextInt();
        if(numero <0){
            System.out.println("El numero es menor que 0");
        } else{
            System.out.println("El numero es mayor o igual que 0");
        }
    }
}
