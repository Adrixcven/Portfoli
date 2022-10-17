/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m03uf5ex3;

import java.util.Stack;

/**
 *
 * @author Adrix
 */
public class Calculadora {

    public static int avaluar(String expressio) {
        expressio = expressio.trim();
        char[] carac = expressio.toCharArray();
        Stack<Integer> Numeros = new Stack<>();
        Stack<Character> Operadores = new Stack<>();
        for (int i = 0; i < carac.length; i++) {
            if (esNumero(carac[i])) {
                StringBuilder cantidad = new StringBuilder();
                while (i < carac.length && esNumero((carac[i]))) {
                    cantidad.append(carac[i++]);
                }
                Numeros.push(Integer.parseInt(cantidad.toString()));
                i--;
            } else if (esOpe(carac[i])) {
                while (!Operadores.empty()) {
                    Numeros.push(calcular(Operadores.pop(), Numeros.pop(), Numeros.pop()));
                }
                Operadores.push(carac[i]);
            } else {
                throw new IllegalArgumentException(Character.toString(carac[i]));
            }
        }
        return Numeros.pop();
    }
    

    public static boolean esNumero(char a) {
        boolean es = false;
        if (a >= '0' && a <= '9') {
            es = true;
        }
        return es;
    }

    public static boolean esOpe(char a) {
        boolean es = false;
        if (a == '+' || a == '-') {
            es = true;
        }
        return es;
    }
    public static int calcular(char operador, int b, int a){
        int respuesta = 0;
        switch (operador){
            case '+':
                respuesta = b+a;
                break;
            case '-':
                respuesta = b-a;
                break;
        }
        return respuesta;
    }
}
