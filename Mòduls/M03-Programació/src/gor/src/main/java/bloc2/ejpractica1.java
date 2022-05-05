/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloc2;

/**
 *
 * @author Adrix
 */
public class ejpractica1 {
    public static void main(String[] args) {     
        final int num = 10;

        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = (int)(Math.random()*10);
        }

        int[] b = new int[num];
        for (int i = 0; i < num; i++) {
            b[i] = (int)((Math.random()*899) + 100);  
        }

        int[] c = new int[2 * num];
        for (int i = 0; i < 2 * num; i++) {
            if (i % 2 == 0){
                c[i] = a[i/2];
            }else{
                c[i] = b[i/2];
            }
        }

        System.out.print("A[] = ");
        for (int i = 0; i < num; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("B[] = ");
        for (int i = 0; i < num; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        
        System.out.print("C[] = ");
        for (int i = 0; i < 2 * num; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}
