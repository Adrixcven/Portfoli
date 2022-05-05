/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosemanasanta;
import java.util.Scanner;
/**
 *
 * @author Adrix
 */
public class ej1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cantidadpais = in.nextInt();
        String pais[] = new String[cantidadpais];
        in.nextLine();
        for(int i =0; i<cantidadpais; i++){
            pais[i] = in.nextLine();
        }
        ordenaBombolla(pais);
        String busqueda = in.nextLine();
        busquedaBinaria(pais, busqueda);
    }
    public static void busquedaBinaria(String[] arreglo, String busqueda) {
    
    int izquierda = 0, derecha = arreglo.length - 1, contador = 0, resultadoDeLaComparacion = 0, indiceDelElementoDelMedio = 0;
    boolean es = false;
 
    while ((izquierda <= derecha)&& (!es) ) {
        
        indiceDelElementoDelMedio = (int) Math.floor((izquierda + derecha) / 2);
        String elementoDelMedio = arreglo[indiceDelElementoDelMedio];
 
        resultadoDeLaComparacion = busqueda.compareTo(elementoDelMedio);
 
        if (busqueda.equals(elementoDelMedio)) {
            es = true;
        }

        if (resultadoDeLaComparacion < 0) {
            derecha = indiceDelElementoDelMedio - 1;
        } else {
            izquierda = indiceDelElementoDelMedio + 1;
        }
        contador++;
    }

    if(resultadoDeLaComparacion != 0){
        System.out.println("Total passades: " + (contador));
        System.out.println("No trobat");
    } else if(resultadoDeLaComparacion == 0){
        System.out.println("Total passades: " + (contador));
        System.out.println("Trobat a la posició: " + (indiceDelElementoDelMedio));
    }
}
    public static void ordenaBombolla(String[] primers) {
        String aux;
        for (int i = 0; i < primers.length - 1; i++) {
            for (int j = 0; j < primers.length - i - 1; j++) {
                if (primers[j].compareTo(primers[j + 1]) > 0) {
                    aux = primers[j + 1];
                    primers[j + 1] = primers[j];
                    primers[j] = aux;
                }
            }
        }

}
}