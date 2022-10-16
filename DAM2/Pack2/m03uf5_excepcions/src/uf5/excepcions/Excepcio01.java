/***
 * Exemple de NO tractament d'excepcions:
 * 
 * L’exemple següent mostra un programa que conté un error de programació, ja que
 * s’intenta efectuar un recorregut per un vector sortint dels límits permesos. 
 * Aquesta és una excepció catalogada sota RuntimeException (en temps d'execució).
 * 
 */

package uf5.excepcions;

public class Excepcio01 {
    public static void main(String args[]) {
        //Declarem vector
        String vector[]={"Hola","Adéu","Fins demà"};
        
        //Recorregut del vector més allà del final
        for (int i=0; i<=vector.length; i++){
            System.out.println("Posició " + i + " : " + vector[i]);
        }
        
        //Missatge per finalitzar el programa que mai s'imprimirà perque abans 
        //s'acabarà per l'excepció produïda.
        System.out.println("El programa s'ha acabat.");
    }
}
