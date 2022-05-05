package EXAMENMAYO;

import java.util.Scanner;

public class NomsICognoms {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nomComplets = { "Torres Hernández, Pere", "Majoral Gatell, Anna", "Pérez Gomis, Josep", "López López, Rosa", "Camps García, Ricard", "Sánchez Pasqual, Carles", "Mengual Sánchez, Gemma", "Puig Soler, Jordi"};
        System.out.println("Introduce un nombre: ");
        String nom = in.nextLine();
        int numero = cercaBinaria(nomComplets, nom);
        System.out.println(numero);
        if(numero == -1){
            System.out.println("El nom "+nom+" no s'ha trobat a la llista.");
        } else{
            System.out.println("El nom "+nom+" s'ha trobat a la posició "+numero+" de la llista ordenada.");
        }
        System.out.println("");
    }
    public static void ordenaBombolla (String[] nomsComplets){
        
    }
    public static void mostraNoms(String[] nomComplets){
        System.out.println("Llista de noms");
        for(int i = 0; i< nomComplets.length; i++){
            System.out.println((i+1) + ". " + nomComplets[0]);
        }
    }
    public static int cercaBinaria(String[] nomsComplets, String nom){
        String[]nombres = new String[nomsComplets.length];
        for(int i = 0; i<nomsComplets.length; i++){
            String[] arrOfStr = nomsComplets[i].split(",", 2);
            nombres[i] = arrOfStr[1].trim();
        }
        int izquierda = 0, derecha = nombres.length - 1, contador = 0, resultadoDeLaComparacion = 0, indiceDelElementoDelMedio = 0;
    boolean es = false;
 
    while ((izquierda <= derecha)&& (!es) ) {
        indiceDelElementoDelMedio = (int) Math.floor((izquierda + derecha) / 2);
        String elementoDelMedio = nombres[indiceDelElementoDelMedio];
        resultadoDeLaComparacion = nom.compareTo(elementoDelMedio);
        if (nom.equals(elementoDelMedio)) {
            return indiceDelElementoDelMedio;
        }
        if (resultadoDeLaComparacion < 0) {
            derecha = indiceDelElementoDelMedio - 1;
        } else {
            izquierda = indiceDelElementoDelMedio + 1;
        }
        contador++;
    }
        return -1;
        
}
}
