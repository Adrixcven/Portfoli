/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosemanasanta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Adrix
 */
public class ej3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        int cantidadpais = in.nextInt();
        String pais[] = new String[cantidadpais];
        for (int i = 0; i < cantidadpais; i++) {
            pais[i] = in2.nextLine();
        }
        generaVecto(pais);
    }

    public static void generaVecto(String[] pais) {
        ArrayList<String> al = new ArrayList<String>();
        for (int i = 0; i < pais.length; i++) {
            al.add(pais[i]);
        }
        Collections.sort(al);
        Iterator itr = al.iterator();
        System.out.println("Països ordenats:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
