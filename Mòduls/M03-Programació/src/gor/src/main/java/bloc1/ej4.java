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
public class ej4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame el primer numero");
        int un = in.nextInt();
        System.out.println("Dame el segundo numero");
        int dos = in.nextInt();
        int num = (int) (Math.random()*(un+1 -dos)) + dos;
        System.out.println(num);
    }
}
