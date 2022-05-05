/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosemanasanta;

/**
 *
 * @author Adrix
 */
import java.util.*;
public class split {
    //split
    public static void main(String args[]) {
        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("@", 2);

        for (String a : arrOfStr) {
            System.out.print(a + " ");
        }
        //El split parte el string en la posicion indicada hasta el limite que le pongamos
        //str.split(caracter, limite);
    }
    //trims
    public static void trim(String str) {
        String sCadena = " Esto Es Una Cadena";
        System.out.println(sCadena.trim());  //El trim quita los espacios que hay al inicio y al final
    }
    //ordenacion de selecció en int[]
    public static void ordenacioSeleccio(int[] str){
        for(int i = 0; i< str.length; i++){
            int minimo = i;
            for(int j = i+1; j<str.length; j++){
                if(str[j] < str[minimo]){
                    
                }
            }
            int swap = str[i];
            str[i] = str[minimo];
            str[minimo] = swap;
            //ordenacion de Seleccion para numeros.
        }
    }
    //ordenacion de bombolla en int[]
    public static void ordenacioBombolla(int[] str){
        int aux;
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j < str.length - i - 1; j++) {
                if (str[j + 1] < str[j]) {
                    aux = str[j + 1];
                    str[j + 1] = str[j];
                    str[j] = aux;
                }
            }
        }
        //Ordenacion de Burbuja para numeros
    }
    //sort con int[]
    public static void sort(int[] str){
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i<str.length; i++){
            al.add(str[i]);
        }
        Collections.sort(al);
        System.out.println(al);
        //sort para numeros
    }
    //sort con string
    public static void sortconString(int[] str){
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i<str.length; i++){
            al.add(str[i]);
        }
        Collections.sort(al);
        System.out.println(al);
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        //sort para strings
    }
    //ordenacion de seleccion en strings
    public static void ordenaseleccio(float[] numeros) {
        float aux;
        int count = 0;
        for (int i = 0; i < numeros.length; i++) {
            int minimo = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[minimo]) {
                    minimo = j;
                }
                count++;
            }
            aux = numeros[i];
            numeros[i] = numeros[minimo];
            numeros[minimo] = aux;
        }
//ordenar de seleccion para floats
    }
    //ordenacion de burbuja en string
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
        //ordenacion de burbuja con strings
        //el compareTo nos devuelve o 0 o 1. debemos adaptar los if a ello
    }
    //busqueda binaria en string[]
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
    //mostrar el vector
    public static void mostraVecto(float[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
    }
    //genera vector
    public static int[] generaVector(int numElements, Scanner in) {
        int[] primers = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            System.out.println("Que numero?");
            primers[i] = in.nextInt();
        }
        return primers;
    }
    //busqueda binaria en int[]
    public static void cercaBinaria(int[] arrayAleatoris, int numBuscar) {
        System.out.println("\n/////////Binaria////////\n");
        long tempsInicial = System.currentTimeMillis();
        int comptadorPassades = 0;
        int posicio = 0;
        int indexEsquerra = 0;
        int indexDret = arrayAleatoris.length - 1;
        boolean trobat = false;
        while (indexEsquerra <= indexDret && !trobat) {
            posicio = (indexEsquerra + indexDret) / 2;
            if (arrayAleatoris[posicio] == numBuscar) {
                trobat = true;
            } else if (arrayAleatoris[posicio] < numBuscar) {
                indexEsquerra = posicio + 1;
            } else if (arrayAleatoris[posicio] > numBuscar) {
                indexDret = posicio - 1;
            }
            comptadorPassades++;
        }

        if (trobat) {
            // Temps final
            long tempsFinal = System.currentTimeMillis();
            System.out.println("Total passades: " + comptadorPassades);
            System.out.println("Temps total (ms): " + (tempsFinal - tempsInicial));
            System.out.println("L'hem trobat a la posició " + posicio);
        } else {
            System.out.println("NO l'hem trobat a l'array");
        }
    }
}
