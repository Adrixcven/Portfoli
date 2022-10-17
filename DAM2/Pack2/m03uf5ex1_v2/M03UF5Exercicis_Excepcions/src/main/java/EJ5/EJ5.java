/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ5;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Adrix
 */
public class EJ5 {
    public static void main(String args[]) {
        try{
            int peri = Figura();
            System.out.println("El perimetro de la figura es " + peri);
        }catch(ExcepcionMenor3 e){
            System.out.println("Error: Ha puesto menos de 3 lados");
        }catch(ExcepcionNoIgual e){
            System.out.println("Hay mas valores de lados que lados.");
        } 
    }
    public static int Figura()throws ExcepcionMenor3, ExcepcionNoIgual {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame un numero de lados");
        int lados = in.nextInt();
        if (lados < 3) {
            throw new ExcepcionMenor3("Error en la cantidad", "numero menor de 3");
        }
        Stack<Integer> Long = new Stack<>();
        for (int i = 0; i < lados; i++) {
            System.out.println("Dame un valor a cada lado");
            int lon = in.nextInt();
            Long.push(lon);
        }
        if(Long.size()!=lados){
            throw new ExcepcionNoIgual("Error en la cantidad", "numero menor de 3");
        }
        int finaal = Long.pop()*lados;
        return finaal;
    }
}
