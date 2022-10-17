/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ7;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Adrix
 */
public class Alumne {
    private int matricula;
    private String nombre;
    private ArrayList<Integer> nota = new ArrayList<>(8);

    public Alumne(int _matricula, String _nombre, ArrayList<Integer> _nota) {
        this.matricula = _matricula;
        this.nombre = _nombre;
        this.nota = _nota;
    }


    public static int InsertarNota(){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }


}

