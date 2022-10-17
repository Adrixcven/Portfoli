/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.m03uf5ex3;

/**
 *
 * @author Adrix
 */
public class M03UF5EX3 {

    public static void main(String[] args) {
        try{
            System.out.println("El calculo es: " + Calculadora.avaluar("10-3+6+1"));
        }catch(IllegalArgumentException ex){
            System.out.println("Error Error");
        }
    }
}
